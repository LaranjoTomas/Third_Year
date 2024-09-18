package lab06.cake;

public class Cake {
    private Shape shape;
    private String cakeLayer;
    private int numCakeLayers;
    private Cream midLayerCream;
    private Cream topLayerCream;
    private Topping topping;
    private String message;

    public Cake(String cakeLayer) {
        this.cakeLayer = cakeLayer;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public void setCakeLayer(String cakeLayer) {
        this.cakeLayer = cakeLayer;
    }

    public void setnumCakeLayers(int numCakeLayers) {
        this.numCakeLayers = numCakeLayers;
    }

    public void setMidLayerCream(Cream midLayerCream) {
        this.midLayerCream = midLayerCream;
    }

    public void setTopLayerCream(Cream topLayerCream) {
        this.topLayerCream = topLayerCream;
    }

    public void setTopping(Topping topping) {
        this.topping = topping;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void addCakeLayer() {
        this.numCakeLayers++;
    }

    public String getCakeLayer() {
        return cakeLayer;
    }

    @Override
    public String toString() {
        String str = cakeLayer + " cake with " + shape + " shape and " + numCakeLayers + " layers ";
        if (midLayerCream != null)
            str += " and " + midLayerCream.getString();
        if (topLayerCream != null)
            str += ", topped with " + topLayerCream.getString();
        if (topping != null)
            str += " and " + topping.getString();
        str += ". Message says : \"" + message + "\".";
        return str;
    }
}