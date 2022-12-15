package design_patterns_practice.strategy;

public class FlyWithWings implements iFlyingBehaviour{
    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
