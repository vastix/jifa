package name.bpdp.weberia.jifa;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import name.bpdp.weberia.jifa.generated.IfaBaseVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import name.bpdp.weberia.jifa.generated.IfaParser.FunctionDeclContext;

public class SymbolVisitor extends IfaBaseVisitor<IfaValue> {
    Map<String, Function> functions;

    public SymbolVisitor(Map<String, Function> functions) {
        this.functions = functions;
    }

    @Override
    public IfaValue visitFunctionDecl(FunctionDeclContext ctx) {
        List<TerminalNode> params = ctx.idList() != null ? ctx.idList().Identifier() : new ArrayList<TerminalNode>();
        ParseTree block = ctx.block();
        String id = ctx.Identifier().getText() + params.size();
        functions.put(id, new Function(id, params, block));
        return IfaValue.VOID;
    }
}