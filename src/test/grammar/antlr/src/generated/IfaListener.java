// Generated from /home/bpdp/kerjaan/git-repos/vastix/jifa/src/main/antlr/Ifa.g4 by ANTLR 4.5.1

package name.bpdp.vastix.jifa.generated;

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
	/**
	 * Enter a parse tree produced by {@link IfaParser#propositional}.
	 * @param ctx the parse tree
	 */
	void enterPropositional(IfaParser.PropositionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfaParser#propositional}.
	 * @param ctx the parse tree
	 */
	void exitPropositional(IfaParser.PropositionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfaParser#url}.
	 * @param ctx the parse tree
	 */
	void enterUrl(IfaParser.UrlContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfaParser#url}.
	 * @param ctx the parse tree
	 */
	void exitUrl(IfaParser.UrlContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfaParser#scheme}.
	 * @param ctx the parse tree
	 */
	void enterScheme(IfaParser.SchemeContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfaParser#scheme}.
	 * @param ctx the parse tree
	 */
	void exitScheme(IfaParser.SchemeContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfaParser#hier_part}.
	 * @param ctx the parse tree
	 */
	void enterHier_part(IfaParser.Hier_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfaParser#hier_part}.
	 * @param ctx the parse tree
	 */
	void exitHier_part(IfaParser.Hier_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfaParser#net_path}.
	 * @param ctx the parse tree
	 */
	void enterNet_path(IfaParser.Net_pathContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfaParser#net_path}.
	 * @param ctx the parse tree
	 */
	void exitNet_path(IfaParser.Net_pathContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfaParser#abs_path}.
	 * @param ctx the parse tree
	 */
	void enterAbs_path(IfaParser.Abs_pathContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfaParser#abs_path}.
	 * @param ctx the parse tree
	 */
	void exitAbs_path(IfaParser.Abs_pathContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfaParser#segment}.
	 * @param ctx the parse tree
	 */
	void enterSegment(IfaParser.SegmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfaParser#segment}.
	 * @param ctx the parse tree
	 */
	void exitSegment(IfaParser.SegmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfaParser#pchar}.
	 * @param ctx the parse tree
	 */
	void enterPchar(IfaParser.PcharContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfaParser#pchar}.
	 * @param ctx the parse tree
	 */
	void exitPchar(IfaParser.PcharContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfaParser#server}.
	 * @param ctx the parse tree
	 */
	void enterServer(IfaParser.ServerContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfaParser#server}.
	 * @param ctx the parse tree
	 */
	void exitServer(IfaParser.ServerContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfaParser#port}.
	 * @param ctx the parse tree
	 */
	void enterPort(IfaParser.PortContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfaParser#port}.
	 * @param ctx the parse tree
	 */
	void exitPort(IfaParser.PortContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfaParser#host}.
	 * @param ctx the parse tree
	 */
	void enterHost(IfaParser.HostContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfaParser#host}.
	 * @param ctx the parse tree
	 */
	void exitHost(IfaParser.HostContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfaParser#hostname}.
	 * @param ctx the parse tree
	 */
	void enterHostname(IfaParser.HostnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfaParser#hostname}.
	 * @param ctx the parse tree
	 */
	void exitHostname(IfaParser.HostnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfaParser#domainlabel}.
	 * @param ctx the parse tree
	 */
	void enterDomainlabel(IfaParser.DomainlabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfaParser#domainlabel}.
	 * @param ctx the parse tree
	 */
	void exitDomainlabel(IfaParser.DomainlabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfaParser#toplabel}.
	 * @param ctx the parse tree
	 */
	void enterToplabel(IfaParser.ToplabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfaParser#toplabel}.
	 * @param ctx the parse tree
	 */
	void exitToplabel(IfaParser.ToplabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfaParser#ipV4Address}.
	 * @param ctx the parse tree
	 */
	void enterIpV4Address(IfaParser.IpV4AddressContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfaParser#ipV4Address}.
	 * @param ctx the parse tree
	 */
	void exitIpV4Address(IfaParser.IpV4AddressContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfaParser#fragment_}.
	 * @param ctx the parse tree
	 */
	void enterFragment_(IfaParser.Fragment_Context ctx);
	/**
	 * Exit a parse tree produced by {@link IfaParser#fragment_}.
	 * @param ctx the parse tree
	 */
	void exitFragment_(IfaParser.Fragment_Context ctx);
	/**
	 * Enter a parse tree produced by {@link IfaParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(IfaParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfaParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(IfaParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfaParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(IfaParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfaParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(IfaParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfaParser#pname}.
	 * @param ctx the parse tree
	 */
	void enterPname(IfaParser.PnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfaParser#pname}.
	 * @param ctx the parse tree
	 */
	void exitPname(IfaParser.PnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfaParser#pvalue}.
	 * @param ctx the parse tree
	 */
	void enterPvalue(IfaParser.PvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfaParser#pvalue}.
	 * @param ctx the parse tree
	 */
	void exitPvalue(IfaParser.PvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfaParser#qc}.
	 * @param ctx the parse tree
	 */
	void enterQc(IfaParser.QcContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfaParser#qc}.
	 * @param ctx the parse tree
	 */
	void exitQc(IfaParser.QcContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfaParser#uric}.
	 * @param ctx the parse tree
	 */
	void enterUric(IfaParser.UricContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfaParser#uric}.
	 * @param ctx the parse tree
	 */
	void exitUric(IfaParser.UricContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfaParser#unreserved}.
	 * @param ctx the parse tree
	 */
	void enterUnreserved(IfaParser.UnreservedContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfaParser#unreserved}.
	 * @param ctx the parse tree
	 */
	void exitUnreserved(IfaParser.UnreservedContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfaParser#escaped}.
	 * @param ctx the parse tree
	 */
	void enterEscaped(IfaParser.EscapedContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfaParser#escaped}.
	 * @param ctx the parse tree
	 */
	void exitEscaped(IfaParser.EscapedContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfaParser#hex}.
	 * @param ctx the parse tree
	 */
	void enterHex(IfaParser.HexContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfaParser#hex}.
	 * @param ctx the parse tree
	 */
	void exitHex(IfaParser.HexContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfaParser#alphanum}.
	 * @param ctx the parse tree
	 */
	void enterAlphanum(IfaParser.AlphanumContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfaParser#alphanum}.
	 * @param ctx the parse tree
	 */
	void exitAlphanum(IfaParser.AlphanumContext ctx);
	/**
	 * Enter a parse tree produced by {@link IfaParser#reserved}.
	 * @param ctx the parse tree
	 */
	void enterReserved(IfaParser.ReservedContext ctx);
	/**
	 * Exit a parse tree produced by {@link IfaParser#reserved}.
	 * @param ctx the parse tree
	 */
	void exitReserved(IfaParser.ReservedContext ctx);
}