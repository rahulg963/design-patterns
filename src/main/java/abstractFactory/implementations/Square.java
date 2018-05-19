package abstractFactory.implementations;

import abstractFactory.interfaces.Shape;

/**
 * @author Rahul Goel created on 16/5/18
 */


public class Square implements Shape {
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
