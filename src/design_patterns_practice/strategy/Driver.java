package design_patterns_practice.strategy;

public class Driver {
    public static void main(String[] args){
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.setFlyBehaviour(new FlyWithWings());
        mallard.performFly();

        Duck red = new RedHeadDuck();
        red.performFly();

        red.setFlyBehaviour(new FlyingLikeRocket());
        red.performFly();

        red.setFlyBehaviour(new FlyNoWay());
        red.performFly();
    }
}
