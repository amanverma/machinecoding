package designPatterns.DecoratorPattern;

public class Triangle implements  ShapeInterface{

    @Override
    public void draw() {
        System.out.println("Triangle is drawn");
    }
}
