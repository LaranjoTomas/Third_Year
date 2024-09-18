package lab10.ex2;

public class PastaChef extends HeadChef {
    
    @Override
    public void handleRequest(String request) {
        if (request.toLowerCase().contains("pasta")) {
            System.out.println("PastaChef: Let me cook.");
        } else {
            System.out.println("PastaChef: I can't cook that.");
            super.handleRequest(request);
        }
    }
}
