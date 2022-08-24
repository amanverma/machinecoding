package practice.strategy;

public class RedHeadDuck extends  Duck{
    RedHeadDuck(){
        flyingBehaviour = new FlyWithWings();
    }
    @Override
    void display() {
        System.out.println("Red Head Duck");
    }
}
