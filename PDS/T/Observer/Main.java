package Observer;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();

        StatisticsDisplay statisticaDisplay = new StatisticsDisplay();

        weatherData.registerObserver(currentDisplay);
        weatherData.registerObserver(statisticaDisplay);

        weatherData.setMeasurements(28, 65);
        weatherData.setMeasurements(22, 70);
        weatherData.setMeasurements(26, 90);
    }
}
