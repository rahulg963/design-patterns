package builderPattern1.implementation;

import builderPattern1.implementation.Items.Burger;

/**
 * @author Rahul Goel created on 12/5/18
 */


public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    public String name() {
        return "Chicken Burger";
    }
}
