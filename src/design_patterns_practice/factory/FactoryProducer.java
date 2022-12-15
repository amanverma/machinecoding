package design_patterns_practice.factory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String factoryType){
        if (factoryType.equals("rounded")) {
            return new RoundedFactory();
        }
        else return new ShapeFactory();
    }
}


//Producer class to return factory
//abstract factory with schema and atleast one abstract method
//concrete factories to implement abstract method and return product_interface instance
//iCloth -> silkClothes, cottonClothes, juteTextiles
//factories -> cottonFactory, silkFactory, juteFactory all extends AbstractFactory
//Abstract factory -> abstract iCloth getCloth(String clothType) to be implemented by all factories
//Factory producer class -> returns AbstractFactory of specific type.

