package name.bpdp.vastix.jifa;

import name.bpdp.vastix.jifa.generated.*;

public class JifaWalker extends IfaBaseListener {
  public void enterR(IfaParser.RContext ctx ) {
    System.out.println( "Entering R : " + ctx.ID().getText() );
  }

  public void exitR(IfaParser.RContext ctx ) {
    System.out.println( "Exiting R" );
  }
}
