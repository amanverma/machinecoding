Chain of Responsibility belongs to the category of a behavioural design pattern that passes requests via a chain of handlers.

Whenever a request is received, the handler decides whether to process the request or pass it to the next handler of the chain.

It is used for achieving loose coupling where the client request is passed through an object chain to process them.

The above image represents the UML diagram of this pattern. There are 3 components of this design, they are:

Client: This is the point of request origination and the component that accesses the handler for handling the request.
Handler: Handler can either be a class or an interface that received the request primarily and dispatches it to the chain of handlers. This Handler knows only the first handler of the chain.
Concrete Handlers: These are the actual request handlers in sequential order.
This pattern can be used in the following cases:

->Whenever we want to decouple the sender and the receiver of the request.
->Whenever we want multiple objects to handle a request at runtime.
->Whenever we do not want to explicitly specify handlers in the code.
->Whenever we want to issue a request to several objects without explicitly specifying handlers.



Benefits - Behavioural Pattern
 - Reduced coupling degree between sender and receiver. Decouples sender and receiver on the basis of type of request. Each receiver contains reference of next receiver and request is passed on to next receiver if current is unable to handle.
 - Simplified Object. Object doesn't needs to know the chain structure.
 - Increased request processing.
