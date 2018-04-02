package day1;

import java.util.ArrayList;
import java.util.List;

/*
 * 追踪气象站及跟新布告板
 * 问题1: 给谁更新,需要一个集合对象(观察者对象);
 */
public class WeatherData implements WeatherSubject {

    private List<WeatherObserver> observers;
    //温度;
    private double temp;
    //湿度
    private double humidity;
    //压力;
    private double press;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public void setMeasurements(double temp, double humidity, double press) {
        this.temp = temp;
        this.humidity = humidity;
        this.press = press;
        measurementsChanged();
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getPress() {
        return press;
    }

    public void setPress(double press) {
        this.press = press;
    }

    /**
     * 天气数据发生变化的时候,调用次方法;
     */
    public void measurementsChanged() {
        notifyObservers();
    }

    @Override
    public void registerObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(WeatherObserver observer) {
        int i = observers.indexOf(observer);
        if (i > 0) observers.remove(i);
    }

    @Override
    public void notifyObservers() {
        for (WeatherObserver observer : observers) {
            observer.update(this.temp, this.humidity, this.press);
        }
    }
}
