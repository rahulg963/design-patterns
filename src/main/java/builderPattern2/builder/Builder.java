package builderPattern2.builder;

import builderPattern2.House;
import builderPattern2.interfaces.HouseBuilder;

/**
 * @author Rahul Goel created on 12/5/18
 */

class Builder
{
    public static void main(String[] args)
    {
        HouseBuilder iglooBuilder = new IglooHouseBuilder();
        CivilEngineer engineer = new CivilEngineer(iglooBuilder);

        engineer.constructHouse();

        House house = engineer.getHouse();

        System.out.println("Builder constructed: "+ house);
    }
}
