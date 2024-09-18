package lab10.ex2;

public class Main {
    public static void main(String[] args) {
        HeadChef headChef = new HeadChef();
        SushiChef sushiChef = new SushiChef();
        PastaChef pastaChef = new PastaChef();
        BurgerChef burgerChef = new BurgerChef();
        PizzaChef pizzaChef = new PizzaChef();
        DessertChef dessertChef = new DessertChef();
        
        headChef.setNextHandler(sushiChef);
        sushiChef.setNextHandler(pastaChef);
        pastaChef.setNextHandler(burgerChef);
        burgerChef.setNextHandler(pizzaChef);
        pizzaChef.setNextHandler(dessertChef);
        
        System.out.println("\nI want a veggie burger.");
        headChef.handleRequest("I want a veggie burger.");
        
        System.out.println("\nI want a carbonara pasta.");
        headChef.handleRequest("I want a carbonara pasta.");

        System.out.println("\nI want a pepperoni pizza.");
        headChef.handleRequest("I want a PLAIN pizza, with no toppings.");

        System.out.println("\nI want a sushi nigiri and sashimi.");
        headChef.handleRequest("I want a sushi nigiri and sashimi.");

        System.out.println("\nI want a nice *breathes* tuna *breathes* salad.");
        headChef.handleRequest("I want a nice *breathes* tuna *breathes* salad.");

        System.out.println("\nI want a chocolate dessert.");
        headChef.handleRequest("I want a chocolate dessert.\n");
    }
}
