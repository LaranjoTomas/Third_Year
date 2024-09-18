package lab06.cake;

public class FruitCakeBuilder extends AbstractCakeBuilder {

    public FruitCakeBuilder() {
        super("Fruity");
    }

    public void addCreamLayer() {
        cake.setMidLayerCream(Cream.WHIPPED_CREAM);
    }

    public void addTopLayer() {
        cake.setTopLayerCream(Cream.WHIPPED_CREAM);
    }

    public void addTopping() {
        cake.setTopping(Topping.FRUIT);
    }
}
