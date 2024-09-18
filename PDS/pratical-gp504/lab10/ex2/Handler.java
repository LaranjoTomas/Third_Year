package lab10.ex2;

public interface Handler {

    public void handleRequest(String request);
    public void setNextHandler(Handler handler);
}
