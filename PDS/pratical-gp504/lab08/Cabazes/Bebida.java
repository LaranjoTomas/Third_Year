package lab08.Cabazes;

public class Bebida extends Produto {

    public Bebida(String name, int quantity) {
        super(name, quantity);
    }

    public void draw() {
        System.out.println(indent.toString() + toString());
    }

    @Override
    public String toString() {
        return "* Bebida '" + getName() + "' [ weight: " + getWeight() + " ]";
    }
}
