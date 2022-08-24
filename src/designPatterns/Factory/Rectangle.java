package designPatterns.Factory;


public class Rectangle implements ShapeInterface {
    @Override
    public void draw() {
        System.out.println("Created Rectangle");
    }
}
