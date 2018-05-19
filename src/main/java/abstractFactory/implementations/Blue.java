package abstractFactory.implementations;

import abstractFactory.interfaces.Color;

/**
 * @author Rahul Goel created on 16/5/18
 */


public class Blue implements Color {
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
