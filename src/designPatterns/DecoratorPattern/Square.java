package designPatterns.DecoratorPattern;

public class Square implements ShapeInterface{
    @Override
    public void draw() {
        System.out.println("Square is drawn");
    }
}
