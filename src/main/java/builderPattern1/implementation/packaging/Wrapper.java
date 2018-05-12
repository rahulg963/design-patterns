package builderPattern1.implementation.packaging;

import builderPattern1.interfaces.Packing;

/**
 * @author Rahul Goel created on 12/5/18
 */


public class Wrapper implements Packing {

    public String pack() {
        return "Wrapper";
    }

}
