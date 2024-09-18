import java.util.*;

@SuppressWarnings("CheckReturnValue")
public class VectorVis extends VectorBaseVisitor<Value> {

   Map<String, Value> symbolTable = new HashMap<>();

   @Override
   public Value visitProgram(VectorParser.ProgramContext ctx) {
      return visitChildren(ctx);
   }

   @Override
   public Value visitStatementshow(VectorParser.StatementshowContext ctx) {
      Value res = visit(ctx.expr());
      if (res != null) {
         System.out.println("show: " + res);
      } else {
         System.err.println("Error here! (show): ");
         System.exit(1);
      }
      return null;
   }

   @Override
   public Value visitStatID(VectorParser.StatIDContext ctx) {
      Value expr = visit(ctx.expr());
      String varname = ctx.ID().getText();
      return symbolTable.put(varname, expr);
   }

   @Override
   public Value visitExprVector(VectorParser.ExprVectorContext ctx) {
      String vector = ctx.VECTOR().getText();
      try {
         return new Vector(vector);
      } catch (Exception e) {
         System.out.println("Error making the vector");
      }
      return null;
   }

   @Override
   public Value visitExprUnary(VectorParser.ExprUnaryContext ctx) {
      Value res = visit(ctx.expr());
      if (res != null && ctx.op.getText().equals("-")) {
         return res.symmetric();
      }
      return res;
   }

   @Override
   public Value visitExprAddSub(VectorParser.ExprAddSubContext ctx) {
      Value expr1 = visit(ctx.expr(0));
      Value expr2 = visit(ctx.expr(1));

      if (expr1 != null && expr2 != null) {
         if (expr1.getClass().equals(expr2.getClass())) {
            if (ctx.op.getText().equals("+")) {
               return expr1.sum(expr2);
            } else {
               return expr1.sub(expr2);
            }
         } else {
            System.out.println("Error making sub or add! ");
         }
      }
      return null;
   }

   @Override
   public Value visitExprMulDiv(VectorParser.ExprMulDivContext ctx) {
      Value expr1 = visit(ctx.expr(0));
      Value expr2 = visit(ctx.expr(1));

      if (expr1 != null && expr2 != null) {
         if (!(expr1.isVector() && expr2.isVector())) {
            return expr1.multiply(expr2);
         } else {
            System.err.println("Error in multiplying!");
         }
      }
      return null;
   }

   @Override
   public Value visitExprNumber(VectorParser.ExprNumberContext ctx) {
      return new Escalar(Double.parseDouble(ctx.NUMBER().getText()));
   }

   @Override
   public Value visitExprID(VectorParser.ExprIDContext ctx) {
      String varname = ctx.ID().getText();
      Value value = symbolTable.get(varname);
      if (value == null) {
         System.err.println("Error here! (exprNumber)");
         System.exit(1);
      }
      return value;
   }

   @Override
   public Value visitExprParan(VectorParser.ExprParanContext ctx) {
      return visit(ctx.expr());
   }

   @Override
   public Value visitExprEscalar(VectorParser.ExprEscalarContext ctx) {
      Value expr1 = visit(ctx.expr(0));
      Value expr2 = visit(ctx.expr(1));
      if (expr1 != null && expr2 != null) {
         if (expr1.isVector() && expr2.isVector()) {
            return ((Vector) expr1).internalProduct(expr2);
         } else {
            System.err.println("Error in internalProduct!");
         }
      }
      return null;
   }
}
