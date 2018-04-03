package day2;


public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        sys(beverage);

        Mocha mocha = new Mocha(beverage);
        sys(mocha);

        mocha = new Mocha(mocha);
        sys(mocha);

        mocha = new Mocha(new HouseBlend());
        sys(mocha);
    }

    private static void sys(Beverage beverage) {
        System.out.println(beverage.getDes() + "   $" + beverage.cast());
    }
}
