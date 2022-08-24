An observer design pattern is a type of behavioural design pattern that is used for defining the one to many dependencies between the objects.

It is most useful when we want to get notified about any change in the state of an object. In this pattern, when the state of one object changes, all the dependent objects are notified automatically.

The object whose state is monitored is called the Subject whereas the dependents are called the Observers.

In Java, we can implement this pattern by making use of the java.util.Observable class and the java.util.Observer interface.

UML Diagram
1. Observer (+update:void) ,  Subject(-observerList, +registerObserver:void, +removeObserver(o):void, +notifyObserver(o):void)
2. ObserverA(+update:void) and ObserverB(+udpate:void).......

This design pattern has 3 main components:

1. Subject - This can be an interface or an abstract class that defines operations for attaching (registerObserver()) and detaching the observers (removeObserver()) to the subject.
2. Concrete Subject - This is a concrete class of the Subject. This maintains the object state and whenever any change occurs in that state, the observers are notified about it using notifyObservers() method.
3. Observer - This is an interface or an abstract class that defines the operations for notifying this object (update()).

Real Example : One real work example of this pattern is Facebook or Twitter. Whenever a person updates the status, all the followers would get a notification about his update. An observer can get the notification of the subject as long as it is subscribed or keeping track of it.

Question:
Built a weather app such that WeatherObject can read updated data from Weather Station and need to support API for different displays.
