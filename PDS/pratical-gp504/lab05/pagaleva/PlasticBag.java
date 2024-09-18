package lab05.pagaleva;

public class PlasticBag extends Container {
    private Portion portion;

    public PlasticBag(Portion portion) {
        this.portion = portion;
        this.temperature = portion.getTemperature();
        this.state = portion.getState();
    }

    @Override
    public String toString() {
        return "PlasticBag with portion = " + portion.toString();
    }
}
