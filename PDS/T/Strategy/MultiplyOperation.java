package Strategy;

public class MultiplyOperation implements Operation {
    @Override
    public int performOperation(int num1, int num2) {
        return num1 * num2;
    }
}
