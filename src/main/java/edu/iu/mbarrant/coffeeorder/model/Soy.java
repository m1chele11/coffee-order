package edu.iu.mbarrant.coffeeorder.model;

public class Soy extends CondimentDecorator{
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
    @Override
    public float cost() {
        return beverage.cost() + .15F;
    }
}
