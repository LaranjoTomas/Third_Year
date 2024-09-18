// Generated from CsvTable.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CsvTableParser}.
 */
public interface CsvTableListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CsvTableParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(CsvTableParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsvTableParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(CsvTableParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsvTableParser#hdr}.
	 * @param ctx the parse tree
	 */
	void enterHdr(CsvTableParser.HdrContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsvTableParser#hdr}.
	 * @param ctx the parse tree
	 */
	void exitHdr(CsvTableParser.HdrContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsvTableParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(CsvTableParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsvTableParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(CsvTableParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsvTableParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(CsvTableParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsvTableParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(CsvTableParser.FieldContext ctx);
}