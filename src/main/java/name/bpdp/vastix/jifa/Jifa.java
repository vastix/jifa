package name.bpdp.vastix.jifa;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import name.bpdp.vastix.jifa.generated.*;

public class Jifa {
  public static void main( String[] args) throws Exception 
  {
    IfaLexer lexer = new IfaLexer( new ANTLRFileStream("src/main/resources/get-list.ifa"));
    CommonTokenStream tokens = new CommonTokenStream( lexer );
    IfaParser parser = new IfaParser( tokens );
    ParseTree tree = parser.r();
    ParseTreeWalker walker = new ParseTreeWalker();
    walker.walk( new JifaWalker(), tree );
  }
}
