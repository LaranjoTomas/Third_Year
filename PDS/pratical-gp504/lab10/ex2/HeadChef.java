package lab10.ex2;

public class HeadChef implements Handler{

    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handleRequest(String request) {
        if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("HeadChef: You cooked too hard.");
        }   
    }
}
