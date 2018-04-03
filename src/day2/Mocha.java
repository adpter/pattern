package day2;

public class Mocha extends Condiment {

    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDes() {
        return beverage.getDes() + ", Mocha";
    }

    @Override
    public double cast() {
        return beverage.cast() + .20;
    }
}
