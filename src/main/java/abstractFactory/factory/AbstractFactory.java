package abstractFactory.factory;

import abstractFactory.interfaces.Color;
import abstractFactory.interfaces.Shape;

/**
 * @author Rahul Goel created on 16/5/18
 */


public abstract class AbstractFactory {
    abstract public Color getColor(String color);
    abstract public Shape getShape(String shape) ;
}
