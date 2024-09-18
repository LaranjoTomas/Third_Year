package Visitor;

public class Rectangle implements Element{
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
