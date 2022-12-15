package design_patterns_practice.decorator;

public class Chocolate extends CondimentDecorator{
    Chocolate(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public int cost() {
        return beverage.cost()+ 10;
    }

    @Override
    void getDescription() {
        System.out.println("Chocolate added");
    }
}
