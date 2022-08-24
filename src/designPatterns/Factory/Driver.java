package designPatterns.Factory;

public class Driver {
    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();
        ShapeInterface triangle =  shapeFactory.getShapeInstance("TRIANGLE");
        triangle.draw();
        ShapeInterface rectangle =  shapeFactory.getShapeInstance("RECTANGLE");
        rectangle.draw();
        ShapeInterface square =  shapeFactory.getShapeInstance("SQUARE");
        square.draw();


    }



}
