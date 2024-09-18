package lab05.pagaleva;

public class PlasticBottle extends Container {
    private Portion portion;

    public PlasticBottle(Portion portion) {
        this.portion = portion;
        this.temperature = portion.getTemperature();
        this.state = portion.getState();
    }

    @Override
    public String toString() {
        return "PlasticBottle with portion = " + portion.toString();
    }
    
}
