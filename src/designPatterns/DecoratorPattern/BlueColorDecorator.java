package designPatterns.DecoratorPattern;

public class BlueColorDecorator extends ShapeDecorator{
    BlueColorDecorator(ShapeInterface shapeInterface) {
        super(shapeInterface);
    }

    @Override
    public void draw(){
        this.shapeInterface.draw();
        fillBlueColor(shapeInterface);
    }

    private void fillBlueColor(ShapeInterface shapeInterface) {
        System.out.println("blue color has been filled");
    }
}
