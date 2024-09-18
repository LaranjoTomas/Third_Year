package lab06.cake;

public class LoCakeBuilder extends AbstractCakeBuilder {

    public LoCakeBuilder() {
        super("Lo");
    }

    public void addCreamLayer() {
        cake.setMidLayerCream(Cream.LO);
    }

    public void addTopLayer() {
        cake.setTopLayerCream(Cream.WHIPPED_CREAM);
    }

    public void addTopping() {
        cake.setTopping(null);
    }
}
