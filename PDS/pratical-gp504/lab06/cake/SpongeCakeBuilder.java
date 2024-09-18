package lab06.cake;

public class SpongeCakeBuilder extends AbstractCakeBuilder {

    public SpongeCakeBuilder() {
        super("Soft Sponge");
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
