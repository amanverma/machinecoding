package design_patterns_practice.strategy;

public class MallardDuck extends  Duck{
    public MallardDuck(){
        flyingBehaviour = new FlyNoWay();
    }

    @Override
    void display() {
        System.out.println("Mallard Duck");
    }
}

