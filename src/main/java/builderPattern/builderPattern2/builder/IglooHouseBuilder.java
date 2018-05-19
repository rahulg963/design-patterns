package builderPattern.builderPattern2.builder;

import builderPattern.builderPattern2.House;
import builderPattern.builderPattern2.interfaces.HouseBuilder;

/**
 * @author Rahul Goel created on 12/5/18
 */

public class IglooHouseBuilder implements HouseBuilder
{
    private House house;

    public IglooHouseBuilder()
    {
        this.house = new House();
    }

    public void buildBasement()
    {
        house.setBasement("Ice Bars");
    }

    public void buildStructure()
    {
        house.setStructure("Ice Blocks");
    }

    public void buildInterior()
    {
        house.setInterior("Ice Carvings");
    }

    public void bulidRoof()
    {
        house.setRoof("Ice Dome");
    }

    public House getHouse()
    {
        return this.house;
    }
}
