package Pizzas;

public class PizzaBuilder {
    private String dough = "", sauce = "", topping = "";

    public PizzaBuilder setDough(String dough) {
        if (dough.equals("Thin") || dough.equals("Thick") || dough.equals("Cheese Burst") || dough.equals("Wheat")
                || dough.equals("Multigrain") || dough.equals("Gluten Free") || dough.equals("thin")
                || dough.equals("thick")) {
            this.dough = dough;
        } else {
            System.out.println("Invalid dough type");
            return null;
        }
        return this;
    }

    public PizzaBuilder setSauce(String sauce) {
        this.sauce = sauce;
        return this;
    }

    public PizzaBuilder setTopping(String topping) {
        this.topping = topping;
        return this;
    }

    public Pizza build() {
        return new Pizza(dough, sauce, topping);
    }
}
