package lab06.cake;

public class YogurtCakeBuilder extends AbstractCakeBuilder {

    public YogurtCakeBuilder() {
        super("Soft Yogurt");
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
