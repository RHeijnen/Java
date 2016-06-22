package FactoryPatterns.Sample4;

/**
 * Created by Indi on 6/22/2016.
 */
public class Factory {

    public Shape getShape(String name){
        if(name == null){
            return null;
        }else if (name.equalsIgnoreCase("circle")){
            return new Circle();
        }else if (name.equalsIgnoreCase("square")){
            return new Square();
        }else if (name.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }return null;
    }
}
