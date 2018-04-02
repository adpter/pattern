package day1;


/**
 * 气象站对象;
 */
public class WeatherState {
    public static void main(String[] args) {
        WeatherData data = new WeatherData();

        CurrentConditionDisplay display = new CurrentConditionDisplay(data);

        data.setMeasurements(25, 10, 0.8);
    }
}
