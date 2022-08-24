package designPatterns.Factory;

public class ShapeFactory {
    public ShapeInterface getShapeInstance(String type){
        if(type==null){
            return null;
        }
        else if(type.equals("RECTANGLE")){
            return new Rectangle();
        }
        else if(type.equals("TRIANGLE")){
            return new Triangle();
        }
        else if(type.equals("SQUARE")){
            return new Square();
        }
        return null;
    }
}
