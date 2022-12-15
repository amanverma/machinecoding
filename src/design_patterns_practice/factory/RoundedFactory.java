package design_patterns_practice.factory;

public class RoundedFactory extends AbstractFactory{
    @Override
    public Shape getShape(String type) {
        if(type=="RECTANGLE")
            return new RoundedRectangle();
        return null;
    }
}
