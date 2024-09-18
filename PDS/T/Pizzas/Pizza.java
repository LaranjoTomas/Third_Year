package Pizzas;

public class Pizza {
    // implement a builder class for pizza orders
    // 1. define a pizza class with atributes suc as dough, sauce and topping
    // 2. Implement a pizzaBuilder class with methods to set different attributes of
    // a pizza object
    // 3. Create a Waiter class responsible for taking ordes and using the
    // pizzabuilder to construct Pizza based on customer preferences
    // 4. Demonstrate the usage of the waiter calss to take orders and contruct
    // pizza object( ex. Hwaianpizza , SpicyPizza, ...)

    private String dough = "", sauce = "", topping = "";

    public Pizza(String dough, String sauce, String topping) {
        this.dough = dough;
        this.sauce = sauce;
        this.topping = topping;
    }

    public String getDough() {
        return dough;
    }

    public String getSauce() {
        return sauce;
    }

    public String getTopping() {
        return topping;
    }

    @Override
    public String toString() {
        return "Pizza{" + "dough='" + dough + '\'' + ", sauce='" + sauce + '\'' + ", topping='" + topping + '\'' + '}';
    }
}
