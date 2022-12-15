package design_patterns_practice.strategy;

public class FlyNoWay implements iFlyingBehaviour{
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
