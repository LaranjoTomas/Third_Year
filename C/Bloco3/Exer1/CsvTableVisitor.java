// Generated from CsvTable.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CsvTableParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CsvTableVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CsvTableParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(CsvTableParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsvTableParser#hdr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHdr(CsvTableParser.HdrContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsvTableParser#row}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow(CsvTableParser.RowContext ctx);
	/**
	 * Visit a parse tree produced by {@link CsvTableParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(CsvTableParser.FieldContext ctx);
}