package FactoryPatterns.Sample3;


/**
 * Created by Indi on 6/22/2016.
 */
public class Factory {
    public Shape getShape(String name){
        if(name.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }else if(name.equalsIgnoreCase("Star")){
            return new Star();
        }else if(name.equalsIgnoreCase("Square")){
            return new Square();
        }return null;
    }
}
