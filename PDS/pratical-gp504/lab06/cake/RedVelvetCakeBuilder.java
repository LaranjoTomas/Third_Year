package lab06.cake;

public class RedVelvetCakeBuilder extends AbstractCakeBuilder {

    public RedVelvetCakeBuilder() {
        super("Red Velvet");
    }

    public void addCreamLayer() {
        cake.setMidLayerCream(Cream.WHIPPED_CREAM);
    }

    public void addTopLayer() {
        cake.setTopLayerCream(Cream.WHIPPED_CREAM);
    }

    public void addTopping() {
        cake.setTopping(Topping.CHOCOLATE);
    }
}
