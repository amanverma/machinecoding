package practice.decorator;

abstract class CondimentDecorator extends Beverage{
    Beverage beverage;
    abstract int cost();
}
