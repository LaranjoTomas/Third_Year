import java.util.*;

@SuppressWarnings("CheckReturnValue")
public class FractionVis extends FracLangBaseVisitor<Fraction> {

   private Map<String, Fraction> symbolTable = new HashMap<>();
   Scanner sc = new Scanner(System.in);

   @Override public Fraction visitProgram(FracLangParser.ProgramContext ctx) {
      Fraction res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Fraction visitStatDisplay(FracLangParser.StatDisplayContext ctx) {
      Fraction res = visit(ctx.expr());
      if( res != null) {
         System.out.println(res);
      } else {
         System.err.println("error in display");
      }
      return null;
   }

   @Override public Fraction visitStatGetVarname(FracLangParser.StatGetVarnameContext ctx) {
      Fraction res = visit(ctx.expr());
      String varname = ctx.ID().getText();
      return symbolTable.put(varname, res);
   }

   @Override public Fraction visitExprMulDiv(FracLangParser.ExprMulDivContext ctx) {
      Fraction expr1 = visit(ctx.expr(0));
      Fraction expr2 = visit(ctx.expr(1));
      if(expr1 != null && expr2 != null) {
         if(ctx.op.getText().equals("*")) {
            return Fraction.mulFraction(expr1, expr2);
         } else {
            return Fraction.DivFraction(expr1, expr2);
         }
      }
      return null;
   }

   @Override public Fraction visitExprFRACTION(FracLangParser.ExprFRACTIONContext ctx) {
      return new Fraction(Integer.parseInt(ctx.NUMBER(0).getText()), Integer.parseInt(ctx.NUMBER(1).getText()));
   }

   @Override public Fraction visitExprSumSub(FracLangParser.ExprSumSubContext ctx) {
      Fraction expr1 = visit(ctx.expr(0));
      Fraction expr2 = visit(ctx.expr(1));
      if(expr1 != null && expr2 != null) {
         if(ctx.op.getText().equals("+")) {
            return Fraction.SumFraction(expr1, expr2);
         } else {
            return Fraction.SubFraction(expr1, expr2);
         }
      }
      return null;
   }

   @Override public Fraction visitExprParent(FracLangParser.ExprParentContext ctx) {
      return visit(ctx.expr());
   }

   @Override public Fraction visitExprUnary(FracLangParser.ExprUnaryContext ctx) {
      Fraction expr = visit(ctx.expr());
      if (expr == null){
         return null;
      }
      
      if (ctx.sign.getText().equals('-')) {
         return Fraction.mulFraction(expr, new Fraction(-1));
      } 
      return expr;
   }

   @Override public Fraction visitExprNumber(FracLangParser.ExprNumberContext ctx) {
      return new Fraction(Integer.parseInt(ctx.NUMBER().getText()));
   }

   @Override public Fraction visitExprAspa(FracLangParser.ExprAspaContext ctx) {
      String string = ctx.ASPAS().getText();
      String input = sc.nextLine();
      if(input.length() == 0) {
         System.err.println("error no input");
         return null;
      }

      String[] data = input.split("/"); 

      try {
         switch (data.length) {
				case 1:
					return new Fraction(Integer.parseInt(input));
				case 2:
					return new Fraction(Integer.parseInt(data[0]), Integer.parseInt(data[1]));
				default:
					System.err.printf("ERROR: invalid fraction %s\n", input);
			}
      } catch (Exception e) {
         System.out.println("catched expection");
         System.exit(1);
      }

      return null;
   }

   @Override public Fraction visitExprID(FracLangParser.ExprIDContext ctx) {
      String variable = ctx.ID().getText();
		if (!symbolTable.containsKey(variable)) {
			System.err.println("ID not found in map " + variable);
		}
		return symbolTable.get(variable);
   }
}
