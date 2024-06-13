import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("CheckReturnValue")
public class Execute extends StrLangBaseVisitor<String> {
   protected Map<String, String> variables = new HashMap<>();
	protected Scanner sc = new Scanner(System.in);

   @Override public String visitPrint(StrLangParser.PrintContext ctx) {
      String s = visit(ctx.expr());
		if (s != null) {
			System.out.println(visit(ctx.expr()));
		}
		return null;
   }

   @Override public String visitAssign(StrLangParser.AssignContext ctx) {
      String varName = ctx.ID().getText();
		String value = visit(ctx.expr());
		return variables.put(varName, value);
   }

   @Override public String visitExpr_concatenate_remove(StrLangParser.Expr_concatenate_removeContext ctx) {
      String s1 = visit(ctx.expr(0));
		String s2 = visit(ctx.expr(1));
      String op = ctx.op.getText();
      // dar parse a op para tipo char
		if (s1 != null && s2 != null && op == '+') {
			return s1.concat(s2);
		} else if (s1 != null && s2 != null && op == '-') {
         return s1.replace(s2, "");
      }
		return null;
   }

   @Override public String visitExpr_quotes(StrLangParser.Expr_quotesContext ctx) {
      String str = ctx.QUOTES().getText();
		return str.substring(1, str.length() - 1);
   }

   @Override public String visitExpr_substitue(StrLangParser.Expr_substitueContext ctx) {
      String original = visit(ctx.expr(0));
		String target = visit(ctx.expr(1));
		String replacement = visit(ctx.expr(2));
		if (original != null && target != null && replacement != null) {
			return original.replace(target, replacement);
		}
		return null;
      
   }

   @Override public String visitExpr_trim(StrLangParser.Expr_trimContext ctx) {
      String printable = visit(ctx.expr());
      if (printable != null) {
         return printable.trim();
      }
      return null;
   }

   @Override public String visitExpr_printID(StrLangParser.Expr_printIDContext ctx) {
      String res = null;
      return visitChildren(ctx);
   }

   @Override public String visitExpr_paren(StrLangParser.Expr_parenContext ctx) {
      return visit(ctx.expr());
   }

   @Override public String visitExpr_input(StrLangParser.Expr_inputContext ctx) {
      System.out.println(visit(ctx.expr()));
		return sc.nextLine();
   }
}
