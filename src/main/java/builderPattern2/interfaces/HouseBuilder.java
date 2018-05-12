package builderPattern2.interfaces;

import builderPattern2.House;

/**
 * @author Rahul Goel created on 12/5/18
 */

public interface HouseBuilder
{

    public void buildBasement();

    public void buildStructure();

    public void bulidRoof();

    public void buildInterior();

    public House getHouse();
}
