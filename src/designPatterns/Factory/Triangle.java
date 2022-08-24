package designPatterns.Factory;

public class Triangle implements ShapeInterface {
    @Override
    public void draw() {
        System.out.println("Created Triangle");
    }
}
