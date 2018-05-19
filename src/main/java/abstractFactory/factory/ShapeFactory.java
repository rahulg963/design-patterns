package abstractFactory.factory;

import abstractFactory.implementations.Circle;
import abstractFactory.implementations.Rectangle;
import abstractFactory.implementations.Square;
import abstractFactory.interfaces.Color;
import abstractFactory.interfaces.Shape;

/**
 * @author Rahul Goel created on 16/5/18
 */


public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        if(shapeType == null){
            return null;
        }

        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();

        }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();

        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }

}
