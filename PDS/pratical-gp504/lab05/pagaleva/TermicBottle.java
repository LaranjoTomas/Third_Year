package lab05.pagaleva;

public class TermicBottle extends Container {
    private Portion portion;

    public TermicBottle(Portion portion) {
        this.portion = portion;
        this.temperature = portion.getTemperature();
        this.state = portion.getState();
    }

    @Override
    public String toString() {
        return "TermicBottle with portion = " + portion.toString();
    }

}
