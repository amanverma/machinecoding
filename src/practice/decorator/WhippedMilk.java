package practice.decorator;

public class WhippedMilk extends CondimentDecorator{
    WhippedMilk(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public int cost() {
        return beverage.cost()+15;
    }

    @Override
    void getDescription() {
        System.out.println("Whipped Milk added");
    }
}
