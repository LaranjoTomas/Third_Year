package lab10.ex2;

public class SushiChef extends HeadChef {

    @Override
    public void handleRequest(String request) {
        if (request.toLowerCase().contains("sushi")) {
            System.out.println("SushiChef: Let me cook.");
        } else {
            System.out.println("SushiChef: I can't cook that.");
            super.handleRequest(request);
        }
    }
}
