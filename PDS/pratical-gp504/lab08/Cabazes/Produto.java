package lab08.Cabazes;

public abstract class Produto implements Interface {
    private String name;
    private double Weight;
    static StringBuffer indent = new StringBuffer();

    public Produto(String name, double Weight) {
        this.name = name;
        this.Weight = Weight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return Weight;
    }

    public abstract void draw();
}
