import java.util.Scanner;

public class Exer101 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double number1 = scanner.nextDouble();
            String operator = scanner.next();
            double number2 = scanner.nextDouble();
            double result = 0;

            switch (operator) {
                case "+":
                    result = number1 + number2;
                    break;
                case "-":
                    result = number1 - number2;
                    break;
                case "*":
                    result = number1 * number2;
                    break;
                case "/":
                    if (number2 != 0) {
                        result = number1 / number2;
                    } else {
                        System.err.println("Error: Division by zero is not allowed.");
                        return;
                    }
                    break;
                default:
                    System.err.println("Error: Invalid operator.");
                    return;
            }

            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Error: Invalid input.");
        }
    }
}