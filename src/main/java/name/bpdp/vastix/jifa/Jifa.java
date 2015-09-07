package name.bpdp.vastix.jifa;

public class Jifa {
  public static void main( String[] args) throws Exception 
  {
    IfaLexer lexer = new IfaLexer( new ANTLRFileStream("src/main/resources/test.ifa"));
    CommonTokenStream tokens = new CommonTokenStream( lexer );
    IfaParser parser = new IfaParser( tokens );
    ParseTree tree = parser.stat();
    ParseTreeWalker walker = new ParseTreeWalker();
    walker.walk( new JifaWalker(), tree );
  }
}
