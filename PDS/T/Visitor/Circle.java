package Visitor;

public class Circle implements Element {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getRadius() {
        return radius;
    }
}
