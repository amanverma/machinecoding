package design_patterns_practice.decorator;

public class Coffee extends Beverage{
    @Override
    int cost() {
        return 5;
    }

    @Override
    void getDescription() {
        System.out.println("Tea");
    }
}
