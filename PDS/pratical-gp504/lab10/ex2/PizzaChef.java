package lab10.ex2;

public class PizzaChef extends HeadChef {
    
    @Override
    public void handleRequest(String request) {
        if (request.toLowerCase().contains("pizza")) {
            System.out.println("PizzaChef: Let me cook.");
        } else {
            System.out.println("PizzaChef: I can't cook that.");
            super.handleRequest(request);
        }
    }
}
