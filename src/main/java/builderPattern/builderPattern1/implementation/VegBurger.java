package builderPattern.builderPattern1.implementation;

import builderPattern.builderPattern1.implementation.Items.Burger;

/**
 * @author Rahul Goel created on 12/5/18
 */


public class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    public String name() {
        return "Veg Burger";
    }
}
