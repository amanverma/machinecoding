#Decorator pattern

Used to add additional functionality to existing object.

Structural pattern that lets users add new features to an existing object without modifying the structure.

Steps:
1. Interface and several concrete implementations of the interface. Example ShapeInterface implemented by rectangle, triangle and square.
2. Create an abstract decorator class that implements above interface.
3. Create a concrete decorator class that extends above abstract decorator.
4. Use the concrete decorator class to decorate the interface objects and verify the output.


iShape (void getArea()) -> implemented by rectangle, triangle, square
abstract abstract_decorator_class implements iShape
 - public void getArea(){}

public class redColorDecorator extends abstract_decorator_class{
  public void fillRedColor()
}

public class redColorDecorator extends abstract_decorator_class{
  public void fillRedColor()
}

public class redColorDecorator extends abstract_decorator_class{
  public void fillRedColor()
}
