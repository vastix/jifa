package name.bpdp.vastix.jifa;

import name.bpdp.vastix.jifa.generated.*;

public class JifaWalker extends IfaBaseListener {
  public void enterStat(IfaParser.StatContext ctx ) {
    System.out.println( "Prop : " + ctx.Propositional().get(0) );
  }

  public void exitStat(IfaParser.StatContext ctx ) {
    System.out.println( "Exiting Statement" );
  }
}
