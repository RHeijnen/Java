package FactoryPatterns.Sample7;

/**
 * Created by Indi on 6/23/2016.
 */
public class Factory {
    Shape getShape(String name){
        if(name.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }return null;
    }
}
