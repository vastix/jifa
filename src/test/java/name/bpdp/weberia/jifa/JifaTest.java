package name.bpdp.weberia.jifa;

import name.bpdp.weberia.jifa.generated.IfaLexer;
import name.bpdp.weberia.jifa.generated.IfaParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.HashMap;
import java.util.Map;
import java.lang.String;

import org.junit.Test;
import static org.junit.Assert.*;

public class JifaTest {

    public String testScript(String strDesc) {

        String resExec = "";

        IfaLexer lexer = new IfaLexer(new ANTLRInputStream(strDesc));
        IfaParser parser = new IfaParser(new CommonTokenStream(lexer));
        parser.setBuildParseTree(true);
        ParseTree tree = parser.parse();

        Scope scope = new Scope();
        Map<String, Function> functions = new HashMap<String, Function>();
        SymbolVisitor symbolVisitor = new SymbolVisitor(functions);
        symbolVisitor.visit(tree);
        EvalVisitor visitor = new EvalVisitor(scope, functions);
        resExec = visitor.visit(tree).toString();

        return resExec;

    }

    @Test
    public void TestPrint() {

        String printScript = "assert(1 + 999 == 1000);";
        assertEquals(true, testScript(printScript));

    }

}