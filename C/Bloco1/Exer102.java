import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Exer102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Double> vars = new HashMap<>();

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] input = line.split(" ");

            if (input.length >= 3 && input[1].equals("=")) {
                String varName = input[0];
                if (input.length > 3) {
                    String[] expression = Arrays.copyOfRange(input, 2, input.length);
                    double value = evaluateExpression(expression, vars);
                    vars.put(varName, value);
                } else {
                    double value = Double.parseDouble(input[2]);
                    vars.put(varName, value);
                }
            } else {
                double result = evaluateExpression(input, vars);
                System.out.println(result);
            }
        }
        sc.close();
    }

    private static double evaluateExpression(String[] expression, Map<String, Double> vars) {
        double result = 0;
        double leftOperand = 0;
        double rightOperand = 0;

        if (expression[0].matches("[0-9]+")) {
            leftOperand = Double.parseDouble(expression[0]);
        } else {
            leftOperand = vars.get(expression[0]);
        }

        if (expression[2].matches("[0-9]+")) {
            rightOperand = Double.parseDouble(expression[2]);
        } else {
            rightOperand = vars.get(expression[2]);
        }

        switch (expression[1]) {
            case "+":
                result = leftOperand + rightOperand;
                break;
            case "-":
                result = leftOperand - rightOperand;
                break;
            case "*":
                result = leftOperand * rightOperand;
                break;
            case "/":
                result = leftOperand / rightOperand;
                break;
            default:
                System.err.println("Operador inválido: " + expression[1]);
                break;
        }
        return result;
    }
}