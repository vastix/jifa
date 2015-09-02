// Generated from Ifa.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IfaParser}.
 */
public interface IfaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link IfaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(IfaParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(IfaParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfaParser#force}.
	 * @param ctx the parse tree
	 */
	void enterForce(IfaParser.ForceContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfaParser#force}.
	 * @param ctx the parse tree
	 */
	void exitForce(IfaParser.ForceContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfaParser#representatives}.
	 * @param ctx the parse tree
	 */
	void enterRepresentatives(IfaParser.RepresentativesContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfaParser#representatives}.
	 * @param ctx the parse tree
	 */
	void exitRepresentatives(IfaParser.RepresentativesContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfaParser#directives}.
	 * @param ctx the parse tree
	 */
	void enterDirectives(IfaParser.DirectivesContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfaParser#directives}.
	 * @param ctx the parse tree
	 */
	void exitDirectives(IfaParser.DirectivesContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfaParser#commissives}.
	 * @param ctx the parse tree
	 */
	void enterCommissives(IfaParser.CommissivesContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfaParser#commissives}.
	 * @param ctx the parse tree
	 */
	void exitCommissives(IfaParser.CommissivesContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfaParser#expressives}.
	 * @param ctx the parse tree
	 */
	void enterExpressives(IfaParser.ExpressivesContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfaParser#expressives}.
	 * @param ctx the parse tree
	 */
	void exitExpressives(IfaParser.ExpressivesContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfaParser#declaratives}.
	 * @param ctx the parse tree
	 */
	void enterDeclaratives(IfaParser.DeclarativesContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfaParser#declaratives}.
	 * @param ctx the parse tree
	 */
	void exitDeclaratives(IfaParser.DeclarativesContext ctx);
}