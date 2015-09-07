package name.bpdp.vastix.jifa;

import name.bpdp.vastix.jifa.generated.*;

public class JifaWalker extends IfaBaseListener {
  public void enterStat(IfaParser.StatContext ctx ) {
    System.out.println( "Prop : " + ctx.propositional(1) );
  }

  public void exitStat(IfaParser.StatContext ctx ) {
    System.out.println( "Exiting Statement" );
  }
}
