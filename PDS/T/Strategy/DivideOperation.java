package Strategy;

public class DivideOperation implements Operation {
    @Override
    public int performOperation(int num1, int num2) {
        return num1 / num2;
    }
}
