package practice.decorator;

public class Driver {
    public static void main(String[] args) {
        Beverage beverage1 = new Coffee();
        System.out.println(beverage1.cost());

        beverage1 = new Mocha(beverage1);
        beverage1 = new WhippedMilk(beverage1);
        beverage1 = new WhippedMilk(beverage1);
        beverage1 = new Chocolate(beverage1);

        System.out.println(beverage1.cost());

    }
}
