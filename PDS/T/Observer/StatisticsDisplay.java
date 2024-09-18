package Observer;

class StatisticsDisplay implements Observer {
    public void update(float temperature, float humidity) {
        System.out.println("Statistics: Temperature - " + temperature + ", Humidity - " + humidity);
    }
}
