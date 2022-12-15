package design_patterns_practice.factory;

public class ShapeFactory extends AbstractFactory{

    @Override
    public Shape getShape(String type) {
        if (type == "RECTANGLE") {
            return new Rectangle();
        }
        return null;
    }
}
