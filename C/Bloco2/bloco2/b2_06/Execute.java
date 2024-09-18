import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("CheckReturnValue")
public class Execute extends CalculatorBaseVisitor<Integer> {
   
   private Map<String, Integer> memory = new HashMap<>();

   @Override public Integer visitProgram(CalculatorParser.ProgramContext ctx) {
      Integer res = null;
      return visitChildren(ctx);
   }

   @Override public Integer visitStat(CalculatorParser.StatContext ctx) {
      Integer result = null;
      if (ctx.expr() != null) {
         result = visit(ctx.expr());
      } else if (ctx.assignment() != null) {
         result = visit(ctx.assignment());
      }
      
      System.out.println(result);
      
      return result;
   }

   @Override public Integer visitAssignment(CalculatorParser.AssignmentContext ctx) {
      Integer value = visit(ctx.expr());
      this.memory.put(ctx.ID().getText(), value);
      return value;
   }

   @Override public Integer visitExprAddSub(CalculatorParser.ExprAddSubContext ctx) {
      Integer res = null;

      if(ctx.op != null) {
         Integer left = visit(ctx.expr(0));
         Integer right = visit(ctx.expr(1));
         if (ctx.op.getText().equals("+")) {
            res = left + right;
         } else {
            res = left - right;
         }
      }
      return res;
   }

   @Override public Integer visitExprMultDivMod(CalculatorParser.ExprMultDivModContext ctx) {
      if (ctx.op == null || ctx.expr(0) == null || ctx.expr(1) == null) {
         return null;
      }

      Integer left = visit(ctx.expr(0));
      Integer right = visit(ctx.expr(1));

      if (left == null || right == null) {
         return null;
      }

      if (ctx.op.getText().equals("*")) {
         return left * right;
      } else if (ctx.op.getText().equals("/")) {
         if (right != 0) {
            return left / right;
         } else {
            throw new ArithmeticException("Division by zero is not allowed.");
         }
      } else {
         return left % right;
      }
   }

   @Override public Integer visitExprIntefer(CalculatorParser.ExprInteferContext ctx) {
      return Integer.parseInt(ctx.Integer().getText());
   }

   @Override public Integer visitExprID(CalculatorParser.ExprIDContext ctx) {
      return this.memory.get(ctx.ID().getText());
   }
}