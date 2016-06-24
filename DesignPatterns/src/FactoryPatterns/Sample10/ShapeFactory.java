package FactoryPatterns.Sample10;

/**
 * Created by Indi on 6/24/2016.
 */
public class ShapeFactory {

    Shape getShape(String shapename){
        if(shapename.equalsIgnoreCase("Star")){
            return new Star();
        }else if (shapename.equalsIgnoreCase("Square")){
            return new Square();
        }return null;
    }
}
