package lab08.Cabazes;

public class Doce extends Produto {

    public Doce(String name, int quantity) {
        super(name, quantity);
    }

    public void draw(){
        System.out.println(indent.toString() + toString());
    }

    @Override
    public String toString() {
        return "* Doce '" + getName() + "' [ weight: " + getWeight() + " ]";
    }
}
