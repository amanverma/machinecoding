A builder pattern is a type of creational design pattern that lets to construct complex objects in a step by step manner.
The pattern lets to produce different representations of an object using the same construction logic. It helps in creating immutable classes having a large set of attributes.
In the Factory and Abstract Factory Design Patterns, we encounter the following issues if the object contains a lot of attributes:

1. When the arguments are too many, the program will be error-prone while passing from the client to the Factory Class in a specific order. It becomes tedious to maintain the order of arguments when the types are the same.
2. There might be some optional attributes of the object and yet we would be forced to send all parameters and optional attributes as Null.
3. When the object creation becomes complex due to heavy attributes, the complexity of this class would become confusing.

The above ds_algo.problems can also be solved by using constructors of required parameters alone. But this causes an issue when there would be new parameters that are added as part of new requirements. This would result in inconsistency. That’s where Builder comes into the picture. This pattern solves the issue of a large number of optional attributes and the inconsistent state by providing means to build an object in a step-by-step way and return the final object utilizing another method.

Builder Pattern can be implemented in following Steps

1.Create a static nested class, copy all arguments from the outer class. This nested class would be called the Builder class.
   Proper naming convention has to be followed while naming this builder class. For example, if the name of the class is Interviewbit, then the name of the builder would be InterviewbitBuilder.

2. The builder class should have a public constructor with all required attributes sent as parameters.

3. The builder class should have methods for setting optional parameters and return the same builder object post setting these values.

4. The last step is to have a build() method inside the builder class that returns the Object needed by the client. This would require a private constructor in the class that takes the Builder class as the parameter.

Following is the sample example of the builder pattern implementation. We have a User class and we will be building UserBuilder class to build the objects of the User class.