package builderPattern.builderPattern1.implementation.Items;

import builderPattern.builderPattern1.implementation.packaging.Wrapper;
import builderPattern.builderPattern1.interfaces.Item;
import builderPattern.builderPattern1.interfaces.Packing;

/**
 * @author Rahul Goel created on 12/5/18
 */


public abstract class Burger implements Item {

    public Packing packing() {
        return new Wrapper();
    }

    public abstract float price();
}
