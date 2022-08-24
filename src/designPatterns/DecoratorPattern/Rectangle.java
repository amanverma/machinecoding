package designPatterns.DecoratorPattern;

public class Rectangle implements ShapeInterface{
    @Override
    public void draw() {
        System.out.println("Rectange is drawn");
    }
}
