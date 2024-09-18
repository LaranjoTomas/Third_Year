// Generated from StrLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link StrLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface StrLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link StrLangParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(StrLangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code print}
	 * labeled alternative in {@link StrLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(StrLangParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link StrLangParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(StrLangParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr_concatenate_remove}
	 * labeled alternative in {@link StrLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_concatenate_remove(StrLangParser.Expr_concatenate_removeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr_quotes}
	 * labeled alternative in {@link StrLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_quotes(StrLangParser.Expr_quotesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr_substitue}
	 * labeled alternative in {@link StrLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_substitue(StrLangParser.Expr_substitueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr_trim}
	 * labeled alternative in {@link StrLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_trim(StrLangParser.Expr_trimContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr_printID}
	 * labeled alternative in {@link StrLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_printID(StrLangParser.Expr_printIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr_paren}
	 * labeled alternative in {@link StrLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_paren(StrLangParser.Expr_parenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expr_input}
	 * labeled alternative in {@link StrLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_input(StrLangParser.Expr_inputContext ctx);
}