package builderPattern.builderPattern1.implementation.Items;

import builderPattern.builderPattern1.implementation.packaging.Bottle;
import builderPattern.builderPattern1.interfaces.Item;
import builderPattern.builderPattern1.interfaces.Packing;

/**
 * @author Rahul Goel created on 12/5/18
 */


public abstract class ColdDrink implements Item {

    public Packing packing() {
        return new Bottle();
    }

    public abstract float price();
}
