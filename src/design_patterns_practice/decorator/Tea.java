package design_patterns_practice.decorator;

public class Tea extends Beverage{
    @Override
    int cost() {
        return 10;
    }

    @Override
    void getDescription() {
        System.out.println("Tea");
    }

}
