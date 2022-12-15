package designPatterns.DecoratorPattern;

public class Driver {
    public static void main(String[] args){
        ShapeInterface triangle = new Triangle();
        ShapeInterface redRectangle = new RedColorDecorator(new Rectangle());

        triangle.draw();  //prints triangle is drawn
        redRectangle.draw(); // triangle is drawn //red color has been added.


        ShapeInterface blueSquare = new BlueColorDecorator(new Square());
        blueSquare.draw();
    }
}
