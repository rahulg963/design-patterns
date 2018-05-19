package abstractFactory.factory;

import abstractFactory.implementations.Blue;
import abstractFactory.implementations.Green;
import abstractFactory.implementations.Red;
import abstractFactory.interfaces.Color;
import abstractFactory.interfaces.Shape;

/**
 * @author Rahul Goel created on 16/5/18
 */


public class ColorFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {

        if(color == null){
            return null;
        }

        if(color.equalsIgnoreCase("RED")){
            return new Red();

        }else if(color.equalsIgnoreCase("GREEN")){
            return new Green();

        }else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }

        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
