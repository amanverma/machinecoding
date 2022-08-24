Proxy design pattern falls under the category of structural design that represents the functionality of other classes. This pattern lets the developers provide a substitute for another object. This is called a proxy object.

This helps to control the access to the original object and allows us to perform many tasks before or after the request reaches the original object.

As shown in the figure above, in this pattern, we have a ServiceInterface interface that has some operation. This interface is being implemented by a Service class and a Proxy class. The Service class has useful business logic and the Proxy class has a reference field pointing to the service object. Once the proxy finishes processing lazy initialization, logging, caching etc, the request will be passed to the service object. And finally, we have a client that works with the services and the proxies by using the interface. This helps to pass proxy objects to any piece of code.

