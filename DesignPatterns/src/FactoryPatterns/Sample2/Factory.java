package FactoryPatterns.Sample2;

/**
 * Created by Indi on 6/22/2016.
 */
public class Factory {

    Shape getShape(String shapename){
        if(shapename == null){
            return null;
        }else if(shapename.equalsIgnoreCase("STAR")){
            return new Star();
        }else if (shapename.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }else if(shapename.equalsIgnoreCase("SQUARE")){
            return new Square();
        }return null;
    }
}
