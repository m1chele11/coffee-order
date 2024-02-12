package edu.iu.mbarrant.coffeeorder.model;

public class DarkRoast extends Beverage{

    @Override
    public String getDescription() {
        return "Dark roast";
    }
    @Override
    public float cost() {
        return 3.99F;
    }


}
