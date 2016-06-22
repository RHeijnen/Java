package FactoryPatterns.Sample5;

/**
 * Created by Indi on 6/22/2016.
 */
public class Factory {
    public Shape getShape(String name){
        if(name == null){
            return null;
        }if(name.equalsIgnoreCase("star")){
            return new Star();
        }if(name.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }if(name.equalsIgnoreCase("Circle")){
            return new Circle();
        }
        return null;
    }

}
