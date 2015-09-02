package name.bpdp.vastix.jifa;

import name.bpdp.vastix.jifa.generated.*;

public class JifaWalker extends IfaBaseListener {
  public void enterStat(IfaParser.StatContext ctx ) {
    System.out.println( "Entering Statement : " + ctx.ID().getText() );
  }

  public void exitStat(IfaParser.StatContext ctx ) {
    System.out.println( "Exiting Statement" );
  }
}
