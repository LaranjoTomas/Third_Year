package lab08.Cabazes;

public class Conserva extends Produto {

    public Conserva(String name, int quantity) {
        super(name, quantity);
    }

    public void draw() {
        System.out.println(indent.toString() + toString());
    }

    @Override
    public String toString() {
        return "* Conserva '" + getName() + "' [ weight: " + getWeight() + " ]";
    }
}
