package designPatterns.Factory;

public class Square implements ShapeInterface {
    @Override
    public void draw() {
        System.out.println("Created Square");
    }
}
