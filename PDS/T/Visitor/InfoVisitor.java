package Visitor;

public class InfoVisitor implements Visitor {
    public void visit(Circle circle) {
        System.out.println("Circle with radius: " + circle.getRadius());
    }

    public void visit(Rectangle rectangle) {
        System.out.println("Rectangle with width: " + rectangle.getWidth() + " and height: " + rectangle.getHeight());
    }
}
