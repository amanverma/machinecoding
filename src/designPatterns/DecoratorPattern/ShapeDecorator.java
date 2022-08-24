package designPatterns.DecoratorPattern;

public abstract class ShapeDecorator implements  ShapeInterface{
    protected  ShapeInterface shapeInterface;
    ShapeDecorator(ShapeInterface shapeInterface){
        this.shapeInterface = shapeInterface;
    }
    public void draw(){
        this.shapeInterface.draw();
    }

}
