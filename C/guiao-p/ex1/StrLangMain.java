import java.io.IOException;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.Scanner;
import java.io.File;

public class StrLangMain {
   public static void main(String[] args) {
      if (args.length != 1) {
         System.out.println("Executa como ./run <filename>");
         System.exit(1);
      }
      try {
         Scanner sc = new Scanner(new File(args[0]));
         String lineText = null;
         int numLine = 1;
         if (sc.hasNextLine()) {
            lineText = sc.nextLine();
         }
         // create a CharStream that reads from standard input:
         while(lineText != null) {
            CharStream input = CharStreams.fromStream(System.in);
            // create a lexer that feeds off of input CharStream:
            StrLangLexer lexer = new StrLangLexer(input);
            // create a buffer of tokens pulled from the lexer:
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            // create a parser that feeds off the tokens buffer:
            StrLangParser parser = new StrLangParser(tokens);
            // replace error listener:
            //parser.removeErrorListeners(); // remove ConsoleErrorListener
            //parser.addErrorListener(new ErrorHandlingListener());
            // begin parsing at program rule:
            ParseTree tree = parser.program();
            if (parser.getNumberOfSyntaxErrors() == 0) {
               // print LISP-style tree:
               // System.out.println(tree.toStringTree(parser));
               Execute visitor0 = new Execute();
               visitor0.visit(tree);
            }
            if(sc.hasNextLine()) {
               lineText = sc.nextLine();
            } else {
               lineText = null;
            }
         }
      }
      catch(IOException e) {
         e.printStackTrace();
         System.exit(1);
      }
      catch(RecognitionException e) {
         e.printStackTrace();
         System.exit(1);
      }
   }
}
