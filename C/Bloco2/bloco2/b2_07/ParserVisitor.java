import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ParseTree;

@SuppressWarnings("CheckReturnValue")

public class ParserVisitor extends Java8ParserBaseListener {

   @Override public void enterClassDeclaration(Java8Parser.ClassDeclarationContext ctx) {
      String className = ctx.normalClassDeclaration().Identifier().getText();
      System.out.println("Class Name: " + className);
   }

   @Override public void enterMethodDeclaration(Java8Parser.MethodDeclarationContext ctx) {
      String methodName = ctx.methodHeader().methodDeclarator().Identifier().getText();
      System.out.println("Method Name: " + methodName);
   }

   public Void visit(ParseTree tree) {
      // Your implementation here
      return null;
   }
}
