package FactoryPatterns.Sample6;

/**
 * Created by Indi on 6/22/2016.
 */
public class ShapeFactory {

    Shape getShape(String type){
        if(type.equalsIgnoreCase("Circle"))
            return new Circle();
        return null;
    }
}
