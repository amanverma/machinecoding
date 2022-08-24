package practice.factory;

public class RoundedFactory extends AbstractFactory{
    @Override
    public Shape getShape(String type) {
        if(type=="RECTANGLE")
            return new RoundedRectangle();
        return null;
    }
}
