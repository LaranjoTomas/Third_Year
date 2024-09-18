package Strategy;

public class AddOperation implements Operation{
    @Override
    public int performOperation(int num1, int num2) {
        return num1 + num2;
    }
}
