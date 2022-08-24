The bridge pattern is a type of structural design pattern that lets to split large class or closely related classes into 2 hierarchies - abstraction and implementation.

These hierarchies are independent of each other and are used whenever we need to decouple an abstraction from implementation.

This is called a Bridge pattern because it acts as a bridge between the abstract class and the implementation class.

In this pattern, the abstract classes and the implementation classes can be altered or modified independently without affecting the other one.

https://www.interviewbit.com/design-patterns-interview-questions/


 What are some instances where we prefer abstract classes over interfaces in Java?
Both Abstract classes and interfaces in Java follow the principle of writing code for interface rather than the implementation. This principle ensures that flexibility is added to the code to tackle dynamic requirements. Some of the pointers for deciding what to prefer over what are as follows:

Java lets to extend only one class and let’s implement multiple interfaces. If we extend one class then we cannot extend other classes. In such cases, it is better to implement the interfaces wherever possible and reserve the inheritance of classes to only important ones.
Interfaces are used for representing the behaviour of the class. Java lets to implement multiple interfaces which is why we can take the help of interfaces to help classes have multiple behaviours at the same time.
Abstract classes are slightly faster than interfaces. It can be used for time-critical applications.
In cases where there are common behaviours across the inheritance hierarchy, these can be coded at one place in abstract classes. Interfaces and abstract classes can also be used together to define a function in interface and functionality in abstract class.