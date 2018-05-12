import builderPattern1.builder.*;
import builderPattern2.House;
import builderPattern2.builder.*;
import builderPattern2.interfaces.*;
import factoryPattern.factory.*;

/**
 * @author Rahul Goel created on 3/5/18
 */


public class Main {

    public static void main(String[] args) {

//        FACTORY PATTERN
        Computer pc = ComputerFactory.getComputer("pc","2 GB","500 GB","2.4 GHz");
        Computer server = ComputerFactory.getComputer("server","16 GB","1 TB","2.9 GHz");
        System.out.println("Factory PC Config::"+pc);
        System.out.println("Factory Server Config::"+server);


//        BUILDER PATTERN 1
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());


//        BUILDER PATTERN 2
        HouseBuilder iglooBuilder = new IglooHouseBuilder();
        CivilEngineer engineer = new CivilEngineer(iglooBuilder);

        engineer.constructHouse();
        House house = engineer.getHouse();
        System.out.println("Builder constructed: "+ house);
    }

}
