package designPatterns.DecoratorPattern;

public class RedColorDecorator extends  ShapeDecorator{
    RedColorDecorator(ShapeInterface shapeInterface) {
        super(shapeInterface);
    }
    @Override
    public void draw(){
        shapeInterface.draw();
        setRedBorder(shapeInterface);
    }

    private void setRedBorder(ShapeInterface shapeInterface) {
        System.out.println("Red Color Border has been added....");
    }

}
