import java.util.ArrayList;
import java.util.List;

public class Vector extends Value {

    private List<Double> values = new ArrayList<>();

    public Vector(List<Double> values) {
        this.values = values;
        setVector(true);
    }

    public Vector(String values) {
        setVector(true);
        values = values.replace("[", "");
        values = values.replace("]", "");
        String[] Numbers = values.split(",");
        for (String number : Numbers) {
            this.values.add(Double.parseDouble(number));
        }
    }

    @Override
    public Value multiply(Value x) {
        Escalar y = ((Escalar) x);
        List<Double> temporary = new ArrayList<>();
        for (int i = 0; i < this.values.size(); i++) {
            temporary.add(this.values.get(i) * y.getValue());
        }
        return new Vector(temporary);
    }

    public List<Double> getValues() {
        return values;
    }

    public Value internalProduct(Value v) {
        Vector vec1 = ((Vector) v);
        double vector1Product = 1;
        for (double d : vec1.getValues()) {
            vector1Product *= d;
        }
        double myProduct = 1;
        for (double d : this.values) {
            myProduct *= d;
        }
        return new Escalar(myProduct + vector1Product);
    }

    @Override
    public String toString() {
        return values.toString();
    }

    @Override
    public Value symmetric() {
        List<Double> temporary = new ArrayList<>();
        for (int i = 0; i < values.size(); i++) {
            temporary.add(i, values.get(i) * -1);
        }

        return new Vector(temporary);
    }


    @Override
    public Value sum(Value v) {
        List<Double> temporary = new ArrayList<>();

        Vector v1 = (Vector) v;
        for (int i = 0; i < this.values.size() && i < v1.getValues().size(); i++) {
            temporary.add(i, this.values.get(i) + v1.getValues().get(i));
        }
        return new Vector(temporary);
    }
    
    @Override
    public Value sub(Value v) {
        List<Double> temporary = new ArrayList<>();

        Vector v1 = (Vector) v;
        for (int i = 0; i < this.values.size() && i < v1.getValues().size(); i++) {
            temporary.add(i, this.values.get(i) - v1.getValues().get(i));
        }
        return new Vector(temporary);
    }
}
