package design_patterns_practice.strategy;

public class FlyingLikeRocket implements iFlyingBehaviour{
    @Override
    public void fly() {
        System.out.println("Flying Like a Rocket");
    }
}
