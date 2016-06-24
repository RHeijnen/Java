package FactoryPatterns.Sample12;

/**
 * Created by Indi on 6/24/2016.
 */
public class ShapeFactory {

    Shape getShape(String name){
        if(name.equalsIgnoreCase("star")){
            return new Star();
        }else if(name.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }return null;
    }
}
