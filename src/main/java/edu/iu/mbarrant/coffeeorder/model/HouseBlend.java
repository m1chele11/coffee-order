package edu.iu.mbarrant.coffeeorder.model;

public class HouseBlend extends Beverage{

    @Override
    public String getDescription() {
        return "House blend";
    }
    @Override
    public float cost() {
        return 3.89F;
    }
}
