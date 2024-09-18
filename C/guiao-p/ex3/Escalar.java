public class Escalar extends Value {
    private double value;

    public Escalar(double value) {
        this.value = value;
        setEscalar(true);
    }

    public double getValue() {
        return value;
    }

    @Override
    public Value multiply(Value x) {
        if (x instanceof Vector) {
            return x.multiply(this);
        } else {
            return new Escalar(this.value * ((Escalar) x).getValue());
        }
    }

    @Override
    public String toString() {
        return "" + value;
    }

    @Override
    public Value symmetric() {
        return new Escalar(-value);
    }

    @Override
    public Value sum(Value v) {
        return new Escalar(this.value + ((Escalar) v).getValue());
    }

    @Override
    public Value sub(Value v) {
        return new Escalar(this.value - ((Escalar) v).getValue());
    }
}
