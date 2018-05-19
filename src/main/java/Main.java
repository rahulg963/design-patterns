import abstractFactory.factory.AbstractFactory;
import abstractFactory.factory.FactoryProducer;
import abstractFactory.interfaces.Color;
import abstractFactory.interfaces.Shape;
import builderPattern.builderPattern1.builder.*;
import builderPattern.builderPattern2.House;
import builderPattern.builderPattern2.builder.*;
import builderPattern.builderPattern2.interfaces.*;
import factoryPattern.factory.*;

/**
 * @author Rahul Goel created on 3/5/18
 */


public class Main {

    public static void main(String[] args) {

////        FACTORY PATTERN
//        Computer pc = ComputerFactory.getComputer("pc","2 GB","500 GB","2.4 GHz");
//        Computer server = ComputerFactory.getComputer("server","16 GB","1 TB","2.9 GHz");
//        System.out.println("Factory PC Config::"+pc);
//        System.out.println("Factory Server Config::"+server);

////      ABSTRACT FACTORY
//        //get shape factory
//        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
//
//        //get an object of Shape Circle
//        Shape shape1 = shapeFactory.getShape("CIRCLE");
//
//        //call draw method of Shape Circle
//        shape1.draw();
//
//        //get an object of Shape Rectangle
//        Shape shape2 = shapeFactory.getShape("RECTANGLE");
//
//        //call draw method of Shape Rectangle
//        shape2.draw();
//
//        //get an object of Shape Square
//        Shape shape3 = shapeFactory.getShape("SQUARE");
//
//        //call draw method of Shape Square
//        shape3.draw();
//
//        //get color factory
//        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
//
//        //get an object of Color Red
//        Color color1 = colorFactory.getColor("RED");
//
//        //call fill method of Red
//        color1.fill();
//
//        //get an object of Color Green
//        Color color2 = colorFactory.getColor("Green");
//
//        //call fill method of Green
//        color2.fill();
//
//        //get an object of Color Blue
//        Color color3 = colorFactory.getColor("BLUE");
//
//        //call fill method of Color Blue
//        color3.fill();


////        BUILDER PATTERN 1
//        MealBuilder mealBuilder = new MealBuilder();
//
//        Meal vegMeal = mealBuilder.prepareVegMeal();
//        System.out.println("Veg Meal");
//        vegMeal.showItems();
//        System.out.println("Total Cost: " + vegMeal.getCost());
//
//        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
//        System.out.println("\n\nNon-Veg Meal");
//        nonVegMeal.showItems();
//        System.out.println("Total Cost: " + nonVegMeal.getCost());
//
//
////        BUILDER PATTERN 2
//        HouseBuilder iglooBuilder = new IglooHouseBuilder();
//        CivilEngineer engineer = new CivilEngineer(iglooBuilder);
//
//        engineer.constructHouse();
//        House house = engineer.getHouse();
//        System.out.println("Builder constructed: "+ house);
    }

}
