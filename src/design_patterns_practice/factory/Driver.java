package design_patterns_practice.factory;

public class Driver {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = FactoryProducer.getFactory("rounded");
        abstractFactory.getShape("RECTANGLE").draw();


    }
}
