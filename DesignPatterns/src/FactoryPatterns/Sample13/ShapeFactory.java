package FactoryPatterns.Sample13;

/**
 * Created by Indi on 6/24/2016.
 */
public class ShapeFactory {

    Shape getShape(String name){
        if(name.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }else if(name.equalsIgnoreCase("star")){
            return new Star();
        }return null;
    }
}
