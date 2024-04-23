@SuppressWarnings("CheckReturnValue")
public class Execute extends PreffixCalculatorBaseVisitor<Double> {

   @Override public Double visitProgram(PreffixCalculatorParser.ProgramContext ctx) {
      Double res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Double visitStat(PreffixCalculatorParser.StatContext ctx) {
      Double res = null;
      if(ctx.expr() != null) {
         res = visit(ctx.expr());
         System.out.println(res);
      } 
         
      return res;
   }

   @Override public Double visitExprSuffix(PreffixCalculatorParser.ExprSuffixContext ctx) {
      Double res = null;
      if(ctx.op != null) {
         Double left = visit(ctx.expr(0));
         Double right = visit(ctx.expr(1));
         if(ctx.op.getText().equals("+")) {
            res = left + right;
         } else if(ctx.op.getText().equals("-")) {
            res = left - right;
         } else if(ctx.op.getText().equals("*")) {
            res = left * right;
         } else if(ctx.op.getText().equals("/")) {
            res = left / right;
         }
      }
      return res;
   }

   @Override public Double visitExprNumber(PreffixCalculatorParser.ExprNumberContext ctx) {
      Double res = null;
      res = Double.parseDouble(ctx.Number().getText());
      return res;
   }
}
