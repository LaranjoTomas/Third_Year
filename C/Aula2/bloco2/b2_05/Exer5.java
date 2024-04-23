import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Exer5 {
    public static void main(String[] args) throws FileNotFoundException {
        HashMap<String, Integer> numberlist = NumbersMain.Antlr4Main();
        // System.out.println("test" +numberlist);
        Scanner myObj = new Scanner(System.in);

        while(myObj.hasNextLine()){

            String input = myObj.nextLine();  // Read user input
            String[] numbers = input.split("[ -]");

            for (int i = 0; i < numbers.length; i++) {
                if(numberlist.get(numbers[i]) == null){
                    System.out.print(numbers[i]);

                }else{
                    System.out.print(numberlist.get(numbers[i]));            
                }  
                System.out.print(" ");
            }
            System.out.println();

        }

        myObj.close();
    }
}
