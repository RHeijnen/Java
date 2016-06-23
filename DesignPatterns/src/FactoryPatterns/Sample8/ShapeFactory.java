package FactoryPatterns.Sample8;

/**
 * Created by Indi on 6/23/2016.
 */
public class ShapeFactory {
    Shape getShape(String shape){
        if(shape.equalsIgnoreCase("star")){
            return new Star();
        }else if(shape.equalsIgnoreCase("square")){
            return new Square();
        }return null;
    }
}
