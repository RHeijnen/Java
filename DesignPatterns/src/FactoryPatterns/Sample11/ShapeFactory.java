package FactoryPatterns.Sample11;

/**
 * Created by Indi on 6/23/2016.
 */
public class ShapeFactory {

    Shape getShape(String shape){
        if(shape.equalsIgnoreCase("star")){
            return new Star();
        }else if(shape.equalsIgnoreCase("circle")){
            return new Circle();
        }return null;
    }
}
