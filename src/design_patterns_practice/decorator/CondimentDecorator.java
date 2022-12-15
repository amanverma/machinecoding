package design_patterns_practice.decorator;

abstract class CondimentDecorator extends Beverage{
    Beverage beverage;
    abstract int cost();
}
