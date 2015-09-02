// Generated from /home/bpdp/kerjaan/git-repos/vastix/jifa/src/main/antlr/Ifa.g4 by ANTLR 4.5.1

package name.bpdp.vastix.jifa.generated;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link IfaVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class IfaBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements IfaVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitR(IfaParser.RContext ctx) { return visitChildren(ctx); }
}