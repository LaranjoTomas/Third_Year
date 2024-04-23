@SuppressWarnings("CheckReturnValue")
public class Execute extends CalculatorBaseVisitor<Long> {

   @Override public Long visitProgram(CalculatorParser.ProgramContext ctx) {
      Long res = null;
      res = visitChildren(ctx);
      return res;
   }

   @Override public Long visitStat(CalculatorParser.StatContext ctx) {
      Long res = null;

      if(ctx.expr() == null){
         return null;
      }
      res = visit(ctx.expr());
      System.out.println(res);

      return res;
   }

   @Override public Long visitExprAddSub(CalculatorParser.ExprAddSubContext ctx) {
      Long res = null;
      Long left = visit(ctx.expr(0));
      Long right = visit(ctx.expr(1));

      if(ctx.op.getText().equals("+")){
         res = left + right;
      } else if(ctx.op.getText().equals("-")){
         res = left - right;
      }

      return res;
   }

   @Override public Long visitExprParent(CalculatorParser.ExprParentContext ctx) {
      Long res = null;
      res = visit(ctx.expr());
      return res;
   }

   @Override public Long visitExprIntefer(CalculatorParser.ExprInteferContext ctx) {
      return Long.parseLong(ctx.Integer().getText());
   }

   @Override public Long visitExprMultDivMod(CalculatorParser.ExprMultDivModContext ctx) {
      Long res = null;
      Long left = visit(ctx.expr(0));
      Long right = visit(ctx.expr(1));

      if(ctx.op.getText().equals("*")){
         res = left * right;
      } else if(ctx.op.getText().equals("/")){
         res = left / right;
      } else if(ctx.op.getText().equals("%")) {
         res = left % right;
      }

      return res;
   }
}
