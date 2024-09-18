package Strategy;

public class NumberProcessor {
    private Operation operation;

    public NumberProcessor(Operation operation) {
        this.operation = operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public int performOperation(int a, int b) {
        return operation.performOperation(a, b);
    }
}

