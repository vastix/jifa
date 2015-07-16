package name.bpdp.weberia.jifa;

import java.util.HashMap;
import java.util.Map;

import name.bpdp.weberia.jifa.generated.IfaLexer;
import name.bpdp.weberia.jifa.generated.IfaParser;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class Jifa {
    public static void main(String[] args) {
        try {
            IfaLexer lexer = new IfaLexer(new ANTLRFileStream("src/main/resources/get-list.ifa"));
            IfaParser parser = new IfaParser(new CommonTokenStream(lexer));
            parser.setBuildParseTree(true);
            ParseTree tree = parser.parse();

            Scope scope = new Scope();
            Map<String, Function> functions = new HashMap<String, Function>();
            SymbolVisitor symbolVisitor = new SymbolVisitor(functions);
            symbolVisitor.visit(tree);
            EvalVisitor visitor = new EvalVisitor(scope, functions);
            visitor.visit(tree);
            System.out.println(visitor);
        } catch (Exception e) {
            if ( e.getMessage() != null) {
                System.err.println(e.getMessage());
            } else {
                e.printStackTrace();
            }
        }
    }
}