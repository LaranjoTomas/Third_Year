import java.util.HashMap;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

@SuppressWarnings("CheckReturnValue")

public class FillArray extends NumbersBaseListener {

   public HashMap<String, Integer> map = new HashMap<>();

   @Override public void enterProgram(NumbersParser.ProgramContext ctx) {
   }

   @Override public void exitProgram(NumbersParser.ProgramContext ctx) {
   }

   @Override public void enterStat(NumbersParser.StatContext ctx) {
   }

   @Override public void exitStat(NumbersParser.StatContext ctx) {
   }

   @Override public void enterExpr(NumbersParser.ExprContext ctx) {
   }

   @Override public void exitExpr(NumbersParser.ExprContext ctx) {
      map.put(ctx.Word().getText(), Integer.parseInt(ctx.Number().getText()));
   }

   @Override public void enterEveryRule(ParserRuleContext ctx) {
   }

   @Override public void exitEveryRule(ParserRuleContext ctx) {
   }

   @Override public void visitTerminal(TerminalNode node) {
   }

   @Override public void visitErrorNode(ErrorNode node) {
   }
}
