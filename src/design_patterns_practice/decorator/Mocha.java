package design_patterns_practice.decorator;

public class Mocha extends CondimentDecorator{
    Mocha(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public int cost() {
        return beverage.cost()+30;
    }

    @Override
    void getDescription() {
        System.out.println("Mocha added");
    }
}
