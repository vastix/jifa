package name.bpdp.vastix.jifa;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import name.bpdp.vastix.jifa.generated.IfaBaseVisitor;
import name.bpdp.vastix.jifa.generated.IfaParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.TerminalNode;

import name.bpdp.vastix.jifa.generated.IfaParser.AndExpressionContext;
import name.bpdp.vastix.jifa.generated.IfaParser.AssertFunctionCallContext;
import name.bpdp.vastix.jifa.generated.IfaParser.BlockContext;
import name.bpdp.vastix.jifa.generated.IfaParser.DivideExpressionContext;
import name.bpdp.vastix.jifa.generated.IfaParser.ExpressionContext;
import name.bpdp.vastix.jifa.generated.IfaParser.ExpressionExpressionContext;
import name.bpdp.vastix.jifa.generated.IfaParser.ForStatementContext;
import name.bpdp.vastix.jifa.generated.IfaParser.FunctionCallExpressionContext;
import name.bpdp.vastix.jifa.generated.IfaParser.FunctionDeclContext;
import name.bpdp.vastix.jifa.generated.IfaParser.GtEqExpressionContext;
import name.bpdp.vastix.jifa.generated.IfaParser.GtExpressionContext;
import name.bpdp.vastix.jifa.generated.IfaParser.IdentifierFunctionCallContext;
import name.bpdp.vastix.jifa.generated.IfaParser.InExpressionContext;
import name.bpdp.vastix.jifa.generated.IfaParser.InputExpressionContext;
import name.bpdp.vastix.jifa.generated.IfaParser.ListContext;
import name.bpdp.vastix.jifa.generated.IfaParser.ListExpressionContext;
import name.bpdp.vastix.jifa.generated.IfaParser.LtEqExpressionContext;
import name.bpdp.vastix.jifa.generated.IfaParser.LtExpressionContext;
import name.bpdp.vastix.jifa.generated.IfaParser.ModulusExpressionContext;
import name.bpdp.vastix.jifa.generated.IfaParser.MultiplyExpressionContext;
import name.bpdp.vastix.jifa.generated.IfaParser.NotExpressionContext;
import name.bpdp.vastix.jifa.generated.IfaParser.OrExpressionContext;
import name.bpdp.vastix.jifa.generated.IfaParser.PowerExpressionContext;
import name.bpdp.vastix.jifa.generated.IfaParser.SizeFunctionCallContext;
import name.bpdp.vastix.jifa.generated.IfaParser.StatementContext;
import name.bpdp.vastix.jifa.generated.IfaParser.SubtractExpressionContext;
import name.bpdp.vastix.jifa.generated.IfaParser.TernaryExpressionContext;
import name.bpdp.vastix.jifa.generated.IfaParser.UnaryMinusExpressionContext;
import name.bpdp.vastix.jifa.generated.IfaParser.WhileStatementContext;

public class EvalVisitor extends IfaBaseVisitor<IfaValue> {
    private static ReturnValue returnValue = new ReturnValue();
    private Scope scope;
    private Map<String, Function> functions;

    public EvalVisitor(Scope scope, Map<String, Function> functions) {
        this.scope = scope;
        this.functions = functions;
    }

    // functionDecl
    @Override
    public IfaValue visitFunctionDecl(FunctionDeclContext ctx) {
        return IfaValue.VOID;
    }

    // list: '[' exprList? ']'
    @Override
    public IfaValue visitList(ListContext ctx) {
        List<IfaValue> list = new ArrayList<IfaValue>();
        if (ctx.exprList() != null) {
            for(ExpressionContext ex: ctx.exprList().expression()) {
                list.add(this.visit(ex));
            }
        }
        return new IfaValue(list);
    }


    // '-' expression                           #unaryMinusExpression
    @Override
    public IfaValue visitUnaryMinusExpression(UnaryMinusExpressionContext ctx) {
        IfaValue v = this.visit(ctx.expression());
        if (!v.isNumber()) {
            throw new EvalException(ctx);
        }
        return new IfaValue(-1 * v.asDouble());
    }

    // '!' expression                           #notExpression
    @Override
    public IfaValue visitNotExpression(NotExpressionContext ctx) {
        IfaValue v = this.visit(ctx.expression());
        if(!v.isBoolean()) {
            throw new EvalException(ctx);
        }
        return new IfaValue(!v.asBoolean());
    }

    // expression '^' expression                #powerExpression
    @Override
    public IfaValue visitPowerExpression(PowerExpressionContext ctx) {
        IfaValue lhs = this.visit(ctx.expression(0));
        IfaValue rhs = this.visit(ctx.expression(1));
        if (lhs.isNumber() && rhs.isNumber()) {
            return new IfaValue(Math.pow(lhs.asDouble(), rhs.asDouble()));
        }
        throw new EvalException(ctx);
    }

    // expression '*' expression                #multiplyExpression
    @Override
    public IfaValue visitMultiplyExpression(MultiplyExpressionContext ctx) {
        IfaValue lhs = this.visit(ctx.expression(0));
        IfaValue rhs = this.visit(ctx.expression(1));
        if(lhs == null || rhs == null) {
            System.err.println("lhs "+ lhs+ " rhs "+rhs);
            throw new EvalException(ctx);
        }

        // number * number
        if(lhs.isNumber() && rhs.isNumber()) {
            return new IfaValue(lhs.asDouble() * rhs.asDouble());
        }

        // string * number
        if(lhs.isString() && rhs.isNumber()) {
            StringBuilder str = new StringBuilder();
            int stop = rhs.asDouble().intValue();
            for(int i = 0; i < stop; i++) {
                str.append(lhs.asString());
            }
            return new IfaValue(str.toString());
        }

        // list * number
        if(lhs.isList() && rhs.isNumber()) {
            List<IfaValue> total = new ArrayList<IfaValue>();
            int stop = rhs.asDouble().intValue();
            for(int i = 0; i < stop; i++) {
                total.addAll(lhs.asList());
            }
            return new IfaValue(total);
        }
        throw new EvalException(ctx);
    }

    // expression '/' expression                #divideExpression
    @Override
    public IfaValue visitDivideExpression(DivideExpressionContext ctx) {
        IfaValue lhs = this.visit(ctx.expression(0));
        IfaValue rhs = this.visit(ctx.expression(1));
        if (lhs.isNumber() && rhs.isNumber()) {
            return new IfaValue(lhs.asDouble() / rhs.asDouble());
        }
        throw new EvalException(ctx);
    }

    // expression '%' expression                #modulusExpression
    @Override
    public IfaValue visitModulusExpression(ModulusExpressionContext ctx) {
        IfaValue lhs = this.visit(ctx.expression(0));
        IfaValue rhs = this.visit(ctx.expression(1));
        if (lhs.isNumber() && rhs.isNumber()) {
            return new IfaValue(lhs.asDouble() % rhs.asDouble());
        }
        throw new EvalException(ctx);
    }

    // expression '+' expression                #addExpression
    @Override
    public IfaValue visitAddExpression(@NotNull IfaParser.AddExpressionContext ctx) {
        IfaValue lhs = this.visit(ctx.expression(0));
        IfaValue rhs = this.visit(ctx.expression(1));

        if(lhs == null || rhs == null) {
            throw new EvalException(ctx);
        }

        // number + number
        if(lhs.isNumber() && rhs.isNumber()) {
            return new IfaValue(lhs.asDouble() + rhs.asDouble());
        }

        // list + any
        if(lhs.isList()) {
            List<IfaValue> list = lhs.asList();
            list.add(rhs);
            return new IfaValue(list);
        }

        // string + any
        if(lhs.isString()) {
            return new IfaValue(lhs.asString() + "" + rhs.toString());
        }

        // any + string
        if(rhs.isString()) {
            return new IfaValue(lhs.toString() + "" + rhs.asString());
        }

        return new IfaValue(lhs.toString() + rhs.toString());
    }

    // expression '-' expression                #subtractExpression
    @Override
    public IfaValue visitSubtractExpression(SubtractExpressionContext ctx) {
        IfaValue lhs = this.visit(ctx.expression(0));
        IfaValue rhs = this.visit(ctx.expression(1));
        if (lhs.isNumber() && rhs.isNumber()) {
            return new IfaValue(lhs.asDouble() - rhs.asDouble());
        }
        if (lhs.isList()) {
            List<IfaValue> list = lhs.asList();
            list.remove(rhs);
            return new IfaValue(list);
        }
        throw new EvalException(ctx);
    }

    // expression '>=' expression               #gtEqExpression
    @Override
    public IfaValue visitGtEqExpression(GtEqExpressionContext ctx) {
        IfaValue lhs = this.visit(ctx.expression(0));
        IfaValue rhs = this.visit(ctx.expression(1));
        if (lhs.isNumber() && rhs.isNumber()) {
            return new IfaValue(lhs.asDouble() >= rhs.asDouble());
        }
        if(lhs.isString() && rhs.isString()) {
            return new IfaValue(lhs.asString().compareTo(rhs.asString()) >= 0);
        }
        throw new EvalException(ctx);
    }

    // expression '<=' expression               #ltEqExpression
    @Override
    public IfaValue visitLtEqExpression(LtEqExpressionContext ctx) {
        IfaValue lhs = this.visit(ctx.expression(0));
        IfaValue rhs = this.visit(ctx.expression(1));
        if (lhs.isNumber() && rhs.isNumber()) {
            return new IfaValue(lhs.asDouble() <= rhs.asDouble());
        }
        if(lhs.isString() && rhs.isString()) {
            return new IfaValue(lhs.asString().compareTo(rhs.asString()) <= 0);
        }
        throw new EvalException(ctx);
    }

    // expression '>' expression                #gtExpression
    @Override
    public IfaValue visitGtExpression(GtExpressionContext ctx) {
        IfaValue lhs = this.visit(ctx.expression(0));
        IfaValue rhs = this.visit(ctx.expression(1));
        if (lhs.isNumber() && rhs.isNumber()) {
            return new IfaValue(lhs.asDouble() > rhs.asDouble());
        }
        if(lhs.isString() && rhs.isString()) {
            return new IfaValue(lhs.asString().compareTo(rhs.asString()) > 0);
        }
        throw new EvalException(ctx);
    }

    // expression '<' expression                #ltExpression
    @Override
    public IfaValue visitLtExpression(LtExpressionContext ctx) {
        IfaValue lhs = this.visit(ctx.expression(0));
        IfaValue rhs = this.visit(ctx.expression(1));
        if (lhs.isNumber() && rhs.isNumber()) {
            return new IfaValue(lhs.asDouble() < rhs.asDouble());
        }
        if(lhs.isString() && rhs.isString()) {
            return new IfaValue(lhs.asString().compareTo(rhs.asString()) < 0);
        }
        throw new EvalException(ctx);
    }

    // expression '==' expression               #eqExpression
    @Override
    public IfaValue visitEqExpression(@NotNull IfaParser.EqExpressionContext ctx) {
        IfaValue lhs = this.visit(ctx.expression(0));
        IfaValue rhs = this.visit(ctx.expression(1));
        if (lhs == null) {
            throw new EvalException(ctx);
        }
        return new IfaValue(lhs.equals(rhs));
    }

    // expression '!=' expression               #notEqExpression
    @Override
    public IfaValue visitNotEqExpression(@NotNull IfaParser.NotEqExpressionContext ctx) {
        IfaValue lhs = this.visit(ctx.expression(0));
        IfaValue rhs = this.visit(ctx.expression(1));
        return new IfaValue(!lhs.equals(rhs));
    }

    // expression '&&' expression               #andExpression
    @Override
    public IfaValue visitAndExpression(AndExpressionContext ctx) {
        IfaValue lhs = this.visit(ctx.expression(0));
        IfaValue rhs = this.visit(ctx.expression(1));

        if(!lhs.isBoolean() || !rhs.isBoolean()) {
            throw new EvalException(ctx);
        }
        return new IfaValue(lhs.asBoolean() && rhs.asBoolean());
    }

    // expression '||' expression               #orExpression
    @Override
    public IfaValue visitOrExpression(OrExpressionContext ctx) {
        IfaValue lhs = this.visit(ctx.expression(0));
        IfaValue rhs = this.visit(ctx.expression(1));

        if(!lhs.isBoolean() || !rhs.isBoolean()) {
            throw new EvalException(ctx);
        }
        return new IfaValue(lhs.asBoolean() || rhs.asBoolean());
    }

    // expression '?' expression ':' expression #ternaryExpression
    @Override
    public IfaValue visitTernaryExpression(TernaryExpressionContext ctx) {
        IfaValue condition = this.visit(ctx.expression(0));
        if (condition.asBoolean()) {
            return new IfaValue(this.visit(ctx.expression(1)));
        } else {
            return new IfaValue(this.visit(ctx.expression(2)));
        }
    }

    // expression In expression                 #inExpression
    @Override
    public IfaValue visitInExpression(InExpressionContext ctx) {
        IfaValue lhs = this.visit(ctx.expression(0));
        IfaValue rhs = this.visit(ctx.expression(1));

        if (rhs.isList()) {
            for(IfaValue val: rhs.asList()) {
                if (val.equals(lhs)) {
                    return new IfaValue(true);
                }
            }
            return new IfaValue(false);
        }
        throw new EvalException(ctx);
    }

    // Number                                   #numberExpression
    @Override
    public IfaValue visitNumberExpression(@NotNull IfaParser.NumberExpressionContext ctx) {
        return new IfaValue(Double.valueOf(ctx.getText()));
    }

    // Bool                                     #boolExpression
    @Override
    public IfaValue visitBoolExpression(@NotNull IfaParser.BoolExpressionContext ctx) {
        return new IfaValue(Boolean.valueOf(ctx.getText()));
    }

    // Null                                     #nullExpression
    @Override
    public IfaValue visitNullExpression(@NotNull IfaParser.NullExpressionContext ctx) {
        return IfaValue.NULL;
    }

    private IfaValue resolveIndexes(ParserRuleContext ctx, IfaValue val, List<ExpressionContext> indexes) {
        for (ExpressionContext ec: indexes) {
            IfaValue idx = this.visit(ec);
            if (!idx.isNumber() || (!val.isList() && !val.isString()) ) {
                throw new EvalException("Problem resolving indexes on "+val+" at "+idx, ec);
            }
            int i = idx.asDouble().intValue();
            if (val.isString()) {
                val = new IfaValue(val.asString().substring(i, i+1));
            } else {
                val = val.asList().get(i);
            }
        }
        return val;
    }

    private void setAtIndex(ParserRuleContext ctx, List<ExpressionContext> indexes, IfaValue val, IfaValue newVal) {
        if (!val.isList()) {
            throw new EvalException(ctx);
        }
        // TODO some more list size checking in here
        for (int i = 0; i < indexes.size() - 1; i++) {
            IfaValue idx = this.visit(indexes.get(i));
            if (!idx.isNumber()) {
                throw new EvalException(ctx);
            }
            val = val.asList().get(idx.asDouble().intValue());
        }
        IfaValue idx = this.visit(indexes.get(indexes.size() - 1));
        if (!idx.isNumber()) {
            throw new EvalException(ctx);
        }
        val.asList().set(idx.asDouble().intValue(), newVal);
    }

    // functionCall indexes?                    #functionCallExpression
    @Override
    public IfaValue visitFunctionCallExpression(FunctionCallExpressionContext ctx) {
        IfaValue val = this.visit(ctx.functionCall());
        if (ctx.indexes() != null) {
            List<ExpressionContext> exps = ctx.indexes().expression();
            val = resolveIndexes(ctx, val, exps);
        }
        return val;
    }

    // list indexes?                            #listExpression
    @Override
    public IfaValue visitListExpression(ListExpressionContext ctx) {
        IfaValue val = this.visit(ctx.list());
        if (ctx.indexes() != null) {
            List<ExpressionContext> exps = ctx.indexes().expression();
            val = resolveIndexes(ctx, val, exps);
        }
        return val;
    }

    // Identifier indexes?                      #identifierExpression
    @Override
    public IfaValue visitIdentifierExpression(@NotNull IfaParser.IdentifierExpressionContext ctx) {
        String id = ctx.Identifier().getText();
        IfaValue val = scope.resolve(id);

        if (ctx.indexes() != null) {
            List<ExpressionContext> exps = ctx.indexes().expression();
            val = resolveIndexes(ctx, val, exps);
        }
        return val;
    }

    // String indexes?                          #stringExpression
    @Override
    public IfaValue visitStringExpression(@NotNull IfaParser.StringExpressionContext ctx) {
        String text = ctx.getText();
        text = text.substring(1, text.length() - 1).replaceAll("\\\\(.)", "$1");
        IfaValue val = new IfaValue(text);
        if (ctx.indexes() != null) {
            List<ExpressionContext> exps = ctx.indexes().expression();
            val = resolveIndexes(ctx, val, exps);
        }
        return val;
    }

    // '(' expression ')' indexes?              #expressionExpression
    @Override
    public IfaValue visitExpressionExpression(ExpressionExpressionContext ctx) {
        IfaValue val = this.visit(ctx.expression());
        if (ctx.indexes() != null) {
            List<ExpressionContext> exps = ctx.indexes().expression();
            val = resolveIndexes(ctx, val, exps);
        }
        return val;
    }

    // Input '(' String? ')'                    #inputExpression
    @Override
    public IfaValue visitInputExpression(InputExpressionContext ctx) {
        TerminalNode inputString = ctx.String();
        try {
            if (inputString != null) {
                String text = inputString.getText();
                text = text.substring(1, text.length() - 1).replaceAll("\\\\(.)", "$1");
                return new IfaValue(new String(Files.readAllBytes(Paths.get(text))));
            } else {
                BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
                return new IfaValue(buffer.readLine());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    // assignment
    // : Identifier indexes? '=' expression
    // ;
    @Override
    public IfaValue visitAssignment(@NotNull IfaParser.AssignmentContext ctx) {
        IfaValue newVal = this.visit(ctx.expression());
        if (ctx.indexes() != null) {
            IfaValue val = scope.resolve(ctx.Identifier().getText());
            List<ExpressionContext> exps = ctx.indexes().expression();
            setAtIndex(ctx, exps, val, newVal);
        } else {
            String id = ctx.Identifier().getText();
            scope.assign(id, newVal);
        }
        return IfaValue.VOID;
    }

    // Identifier '(' exprList? ')' #identifierFunctionCall
    @Override
    public IfaValue visitIdentifierFunctionCall(IdentifierFunctionCallContext ctx) {
        List<ExpressionContext> params = ctx.exprList() != null ? ctx.exprList().expression() : new ArrayList<ExpressionContext>();
        String id = ctx.Identifier().getText() + params.size();
        Function function;
        if ((function = functions.get(id)) != null) {
            return function.invoke(params, functions, scope);
        }
        throw new EvalException(ctx);
    }

    // Println '(' expression? ')'  #printlnFunctionCall
    @Override
    public IfaValue visitPrintlnFunctionCall(@NotNull IfaParser.PrintlnFunctionCallContext ctx) {
        System.out.println(this.visit(ctx.expression()));
        return IfaValue.VOID;
    }

    // Print '(' expression ')'     #printFunctionCall
    @Override
    public IfaValue visitPrintFunctionCall(@NotNull IfaParser.PrintFunctionCallContext ctx) {
        System.out.print(this.visit(ctx.expression()));
        return IfaValue.VOID;
    }

    // Assert '(' expression ')'    #assertFunctionCall
    @Override
    public IfaValue visitAssertFunctionCall(AssertFunctionCallContext ctx) {
        IfaValue value = this.visit(ctx.expression());

        if(!value.isBoolean()) {
            throw new EvalException(ctx);
        }

        if(!value.asBoolean()) {
            throw new AssertionError("Failed Assertion "+ctx.expression().getText()+" line:"+ctx.start.getLine());
        }

        return IfaValue.VOID;
    }

    // Size '(' expression ')'      #sizeFunctionCall
    @Override
    public IfaValue visitSizeFunctionCall(SizeFunctionCallContext ctx) {
        IfaValue value = this.visit(ctx.expression());

        if(value.isString()) {
            return new IfaValue(value.asString().length());
        }

        if(value.isList()) {
            return new IfaValue(value.asList().size());
        }

        throw new EvalException(ctx);
    }

    // ifStatement
    //  : ifStat elseIfStat* elseStat? End
    //  ;
    //
    // ifStat
    //  : If expression Do block
    //  ;
    //
    // elseIfStat
    //  : Else If expression Do block
    //  ;
    //
    // elseStat
    //  : Else Do block
    //  ;
    @Override
    public IfaValue visitIfStatement(@NotNull IfaParser.IfStatementContext ctx) {

        // if ...
        if(this.visit(ctx.ifStat().expression()).asBoolean()) {
            return this.visit(ctx.ifStat().block());
        }

        // else if ...
        for(int i = 0; i < ctx.elseIfStat().size(); i++) {
            if(this.visit(ctx.elseIfStat(i).expression()).asBoolean()) {
                return this.visit(ctx.elseIfStat(i).block());
            }
        }

        // else ...
        if(ctx.elseStat() != null) {
            return this.visit(ctx.elseStat().block());
        }

        return IfaValue.VOID;
    }

    // block
    // : (statement | functionDecl)* (Return expression)?
    // ;
    @Override
    public IfaValue visitBlock(BlockContext ctx) {

        scope = new Scope(scope); // create new local scope
        for (StatementContext sx: ctx.statement()) {
            this.visit(sx);
        }
        ExpressionContext ex;
        if ((ex = ctx.expression()) != null) {
            returnValue.value = this.visit(ex);
            scope = scope.parent();
            throw returnValue;
        }
        scope = scope.parent();
        return IfaValue.VOID;
    }

    // forStatement
    // : For Identifier '=' expression To expression OBrace block CBrace
    // ;
    @Override
    public IfaValue visitForStatement(ForStatementContext ctx) {
        int start = this.visit(ctx.expression(0)).asDouble().intValue();
        int stop = this.visit(ctx.expression(1)).asDouble().intValue();
        for(int i = start; i <= stop; i++) {
            scope.assign(ctx.Identifier().getText(), new IfaValue(i));
            IfaValue returnValue = this.visit(ctx.block());
            if(returnValue != IfaValue.VOID) {
                return returnValue;
            }
        }
        return IfaValue.VOID;
    }

    // whileStatement
    // : While expression OBrace block CBrace
    // ;
    @Override
    public IfaValue visitWhileStatement(WhileStatementContext ctx) {
        while( this.visit(ctx.expression()).asBoolean() ) {
            IfaValue returnValue = this.visit(ctx.block());
            if (returnValue != IfaValue.VOID) {
                return returnValue;
            }
        }
        return IfaValue.VOID;
    }

}
