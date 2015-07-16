package name.bpdp.weberia.jifa.generated;// Generated from /home/bpdp/kerjaan/git-repos/weberia-vertx/weberia-jifa/src/main/antlr/Ifa.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IfaParser}.
 */
public interface IfaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link IfaParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(IfaParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfaParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(IfaParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfaParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(IfaParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfaParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(IfaParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(IfaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(IfaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(IfaParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfaParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(IfaParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierFunctionCall}
	 * labeled alternative in {@link IfaParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierFunctionCall(IfaParser.IdentifierFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierFunctionCall}
	 * labeled alternative in {@link IfaParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierFunctionCall(IfaParser.IdentifierFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printlnFunctionCall}
	 * labeled alternative in {@link IfaParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterPrintlnFunctionCall(IfaParser.PrintlnFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printlnFunctionCall}
	 * labeled alternative in {@link IfaParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitPrintlnFunctionCall(IfaParser.PrintlnFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printFunctionCall}
	 * labeled alternative in {@link IfaParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterPrintFunctionCall(IfaParser.PrintFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printFunctionCall}
	 * labeled alternative in {@link IfaParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitPrintFunctionCall(IfaParser.PrintFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assertFunctionCall}
	 * labeled alternative in {@link IfaParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterAssertFunctionCall(IfaParser.AssertFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assertFunctionCall}
	 * labeled alternative in {@link IfaParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitAssertFunctionCall(IfaParser.AssertFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sizeFunctionCall}
	 * labeled alternative in {@link IfaParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterSizeFunctionCall(IfaParser.SizeFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sizeFunctionCall}
	 * labeled alternative in {@link IfaParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitSizeFunctionCall(IfaParser.SizeFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfaParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(IfaParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfaParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(IfaParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfaParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(IfaParser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfaParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(IfaParser.IfStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfaParser#elseIfStat}.
	 * @param ctx the parse tree
	 */
	void enterElseIfStat(IfaParser.ElseIfStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfaParser#elseIfStat}.
	 * @param ctx the parse tree
	 */
	void exitElseIfStat(IfaParser.ElseIfStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfaParser#elseStat}.
	 * @param ctx the parse tree
	 */
	void enterElseStat(IfaParser.ElseStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfaParser#elseStat}.
	 * @param ctx the parse tree
	 */
	void exitElseStat(IfaParser.ElseStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfaParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(IfaParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfaParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(IfaParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfaParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(IfaParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfaParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(IfaParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfaParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(IfaParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfaParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(IfaParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfaParser#idList}.
	 * @param ctx the parse tree
	 */
	void enterIdList(IfaParser.IdListContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfaParser#idList}.
	 * @param ctx the parse tree
	 */
	void exitIdList(IfaParser.IdListContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfaParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(IfaParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfaParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(IfaParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gtExpression}
	 * labeled alternative in {@link IfaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGtExpression(IfaParser.GtExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gtExpression}
	 * labeled alternative in {@link IfaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGtExpression(IfaParser.GtExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link IfaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpression(IfaParser.NumberExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link IfaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpression(IfaParser.NumberExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link IfaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(IfaParser.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link IfaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(IfaParser.IdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code modulusExpression}
	 * labeled alternative in {@link IfaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterModulusExpression(IfaParser.ModulusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code modulusExpression}
	 * labeled alternative in {@link IfaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitModulusExpression(IfaParser.ModulusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link IfaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(IfaParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link IfaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(IfaParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplyExpression}
	 * labeled alternative in {@link IfaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyExpression(IfaParser.MultiplyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplyExpression}
	 * labeled alternative in {@link IfaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyExpression(IfaParser.MultiplyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gtEqExpression}
	 * labeled alternative in {@link IfaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGtEqExpression(IfaParser.GtEqExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gtEqExpression}
	 * labeled alternative in {@link IfaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGtEqExpression(IfaParser.GtEqExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link IfaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(IfaParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link IfaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(IfaParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link IfaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStringExpression(IfaParser.StringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link IfaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStringExpression(IfaParser.StringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionExpression}
	 * labeled alternative in {@link IfaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionExpression(IfaParser.ExpressionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionExpression}
	 * labeled alternative in {@link IfaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionExpression(IfaParser.ExpressionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullExpression}
	 * labeled alternative in {@link IfaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNullExpression(IfaParser.NullExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullExpression}
	 * labeled alternative in {@link IfaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNullExpression(IfaParser.NullExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link IfaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpression(IfaParser.FunctionCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link IfaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpression(IfaParser.FunctionCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listExpression}
	 * labeled alternative in {@link IfaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterListExpression(IfaParser.ListExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listExpression}
	 * labeled alternative in {@link IfaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitListExpression(IfaParser.ListExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ltEqExpression}
	 * labeled alternative in {@link IfaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLtEqExpression(IfaParser.LtEqExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ltEqExpression}
	 * labeled alternative in {@link IfaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLtEqExpression(IfaParser.LtEqExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ltExpression}
	 * labeled alternative in {@link IfaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLtExpression(IfaParser.LtExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ltExpression}
	 * labeled alternative in {@link IfaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLtExpression(IfaParser.LtExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link IfaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpression(IfaParser.BoolExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolExpression}
	 * labeled alternative in {@link IfaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpression(IfaParser.BoolExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notEqExpression}
	 * labeled alternative in {@link IfaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotEqExpression(IfaParser.NotEqExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notEqExpression}
	 * labeled alternative in {@link IfaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotEqExpression(IfaParser.NotEqExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divideExpression}
	 * labeled alternative in {@link IfaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDivideExpression(IfaParser.DivideExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divideExpression}
	 * labeled alternative in {@link IfaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDivideExpression(IfaParser.DivideExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpression}
	 * labeled alternative in {@link IfaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpression(IfaParser.OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpression}
	 * labeled alternative in {@link IfaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpression(IfaParser.OrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryMinusExpression}
	 * labeled alternative in {@link IfaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinusExpression(IfaParser.UnaryMinusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryMinusExpression}
	 * labeled alternative in {@link IfaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinusExpression(IfaParser.UnaryMinusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powerExpression}
	 * labeled alternative in {@link IfaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPowerExpression(IfaParser.PowerExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powerExpression}
	 * labeled alternative in {@link IfaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPowerExpression(IfaParser.PowerExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqExpression}
	 * labeled alternative in {@link IfaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqExpression(IfaParser.EqExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqExpression}
	 * labeled alternative in {@link IfaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqExpression(IfaParser.EqExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inExpression}
	 * labeled alternative in {@link IfaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInExpression(IfaParser.InExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inExpression}
	 * labeled alternative in {@link IfaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInExpression(IfaParser.InExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addExpression}
	 * labeled alternative in {@link IfaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddExpression(IfaParser.AddExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addExpression}
	 * labeled alternative in {@link IfaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddExpression(IfaParser.AddExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subtractExpression}
	 * labeled alternative in {@link IfaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSubtractExpression(IfaParser.SubtractExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subtractExpression}
	 * labeled alternative in {@link IfaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSubtractExpression(IfaParser.SubtractExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ternaryExpression}
	 * labeled alternative in {@link IfaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpression(IfaParser.TernaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ternaryExpression}
	 * labeled alternative in {@link IfaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpression(IfaParser.TernaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inputExpression}
	 * labeled alternative in {@link IfaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInputExpression(IfaParser.InputExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inputExpression}
	 * labeled alternative in {@link IfaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInputExpression(IfaParser.InputExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfaParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(IfaParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfaParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(IfaParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfaParser#indexes}.
	 * @param ctx the parse tree
	 */
	void enterIndexes(IfaParser.IndexesContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfaParser#indexes}.
	 * @param ctx the parse tree
	 */
	void exitIndexes(IfaParser.IndexesContext ctx);
}