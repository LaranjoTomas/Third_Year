package lab10.ex2;

public class BurgerChef extends HeadChef {
    
    @Override
    public void handleRequest(String request) {
        if (request.toLowerCase().contains("burger")) {
            System.out.println("BurgerChef: Let me cook.");
        } else {
            System.out.println("BurgerChef: I can't cook that.");
            super.handleRequest(request);
        }
    }
}
