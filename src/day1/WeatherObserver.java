package day1;


/***
 * 观察者对象
 * 共性: 更新数据源
 */

public interface WeatherObserver {

    void update(double temp, double humidity, double press);
}
