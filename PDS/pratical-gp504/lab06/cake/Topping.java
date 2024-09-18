package lab06.cake;

public enum Topping {
    FRUIT("Fruit"),
    CHOCOLATE("Chocolate");

    private final String str;

    Topping(String str) {
        this.str = str;
    }

    public String getString() {
        return str;
    }
}
