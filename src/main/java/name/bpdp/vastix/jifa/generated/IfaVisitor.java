// Generated from /home/bpdp/kerjaan/git-repos/vastix/jifa/src/main/antlr/Ifa.g4 by ANTLR 4.5.1

package name.bpdp.vastix.jifa.generated;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link IfaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface IfaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link IfaParser#r}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR(IfaParser.RContext ctx);
}