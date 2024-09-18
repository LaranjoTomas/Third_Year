public abstract class Value {
    private boolean isVector;
    private boolean isEscalar;

    public void setVector(boolean isVector) {
        this.isVector = isVector;
    }

    public void setEscalar(boolean isEscalar) {
        this.isEscalar = isEscalar;
    }

    public boolean isVector() {
        return isVector;
    }

    public boolean isEscalar() {
        return isEscalar;
    }

    public abstract Value multiply(Value v);

    public abstract String toString();

    public abstract Value symmetric();

    public abstract Value sum(Value expr2);

    public abstract Value sub(Value expr2);
}
