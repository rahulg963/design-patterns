package builderPattern.builderPattern1.builder;

import builderPattern.builderPattern1.implementation.ChickenBurger;
import builderPattern.builderPattern1.implementation.Coke;
import builderPattern.builderPattern1.implementation.Pepsi;
import builderPattern.builderPattern1.implementation.VegBurger;

/**
 * @author Rahul Goel created on 12/5/18
 */


public class MealBuilder {

    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
