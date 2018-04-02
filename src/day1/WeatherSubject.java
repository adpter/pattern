package day1;

/**
 * 储存一个集合对象;
 */
public interface WeatherSubject {

    /**
     * 注册一个观察者对象;
     *
     * @param observer 观察者对象;
     */
    void registerObserver(WeatherObserver observer);

    /**
     * 解除一个观察者对象
     *
     * @param observer 观察者对象;
     */
    void removeObserver(WeatherObserver observer);

    /**
     * 通知所有的观察者;
     */
    void notifyObservers();
}
