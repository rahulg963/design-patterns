package builderPattern1.implementation;

import builderPattern1.implementation.Items.ColdDrink;

/**
 * @author Rahul Goel created on 12/5/18
 */


public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 30.0f;
    }

    public String name() {
        return "Coke";
    }
}
