package builderPattern.builderPattern1.implementation;

import builderPattern.builderPattern1.implementation.Items.ColdDrink;

/**
 * @author Rahul Goel created on 12/5/18
 */


public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    public String name() {
        return "Pepsi";
    }
}
