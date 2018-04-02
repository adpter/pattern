package day1;


public class CurrentConditionDisplay implements DisplayElement, WeatherObserver {

    //温度;
    private double temp;
    //湿度
    private double humidity;
    //压力;
    private double press;
    private WeatherSubject subject;

    public CurrentConditionDisplay(WeatherData subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.print("当前的添加数据为: " + temp + "F degrees  " +
                humidity + "% humidity");
    }


    @Override
    public void update(double temp, double humidity, double press) {
        this.temp = temp;
        this.humidity = humidity;
        this.press = press;
        display();
    }
}
