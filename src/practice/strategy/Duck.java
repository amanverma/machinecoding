package practice.strategy;

abstract class Duck {
    public Duck(){}
    iFlyingBehaviour flyingBehaviour;
    public void performFly(){
        flyingBehaviour.fly();
    }

    public void setFlyBehaviour(iFlyingBehaviour flyingBehaviour){
        this.flyingBehaviour = flyingBehaviour;
    }

    abstract void display();

}
