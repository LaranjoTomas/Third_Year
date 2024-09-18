package Observer;

class CurrentConditionsDisplay implements Observer {
    public void update(float temperature, float humidity) {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }
}
