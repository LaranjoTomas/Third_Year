// Generated from StrLang.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link StrLangParser}.
 */
public interface StrLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link StrLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(StrLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link StrLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(StrLangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code print}
	 * labeled alternative in {@link StrLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrint(StrLangParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print}
	 * labeled alternative in {@link StrLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrint(StrLangParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link StrLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssign(StrLangParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link StrLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssign(StrLangParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_concatenate_remove}
	 * labeled alternative in {@link StrLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_concatenate_remove(StrLangParser.Expr_concatenate_removeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_concatenate_remove}
	 * labeled alternative in {@link StrLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_concatenate_remove(StrLangParser.Expr_concatenate_removeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_quotes}
	 * labeled alternative in {@link StrLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_quotes(StrLangParser.Expr_quotesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_quotes}
	 * labeled alternative in {@link StrLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_quotes(StrLangParser.Expr_quotesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_substitue}
	 * labeled alternative in {@link StrLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_substitue(StrLangParser.Expr_substitueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_substitue}
	 * labeled alternative in {@link StrLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_substitue(StrLangParser.Expr_substitueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_trim}
	 * labeled alternative in {@link StrLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_trim(StrLangParser.Expr_trimContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_trim}
	 * labeled alternative in {@link StrLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_trim(StrLangParser.Expr_trimContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_printID}
	 * labeled alternative in {@link StrLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_printID(StrLangParser.Expr_printIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_printID}
	 * labeled alternative in {@link StrLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_printID(StrLangParser.Expr_printIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_paren}
	 * labeled alternative in {@link StrLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_paren(StrLangParser.Expr_parenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_paren}
	 * labeled alternative in {@link StrLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_paren(StrLangParser.Expr_parenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expr_input}
	 * labeled alternative in {@link StrLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr_input(StrLangParser.Expr_inputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expr_input}
	 * labeled alternative in {@link StrLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr_input(StrLangParser.Expr_inputContext ctx);
}