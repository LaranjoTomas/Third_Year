package lab10.ex2;

public class DessertChef extends HeadChef {

    @Override
    public void handleRequest(String request) {
        if (request.toLowerCase().contains("dessert")) {
            System.out.println("DessertChef: Let me cook.");
        } else {
            System.out.println("DessertChef: I can't cook that.");
            super.handleRequest(request);
        }
    }
}
