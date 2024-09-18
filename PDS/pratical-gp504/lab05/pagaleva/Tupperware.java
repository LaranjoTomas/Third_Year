package lab05.pagaleva;

public class Tupperware extends Container {
    private Portion portion;

    public Tupperware(Portion portion) {
        this.portion = portion;
        this.temperature = portion.getTemperature();
        this.state = portion.getState();
    }

    @Override
    public String toString() {
        return "Tupperware with portion = " + portion.toString();
    }
}
