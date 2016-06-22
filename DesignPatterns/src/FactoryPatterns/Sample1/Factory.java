package FactoryPatterns.Sample1;

/**
 * Created by Indi on 6/22/2016.
 */
public class Factory {

    Shape getShape(String par_content) {
        if (par_content == null){
            return null;
        }
        if(par_content.equalsIgnoreCase("CIRCLE"))
            return new Circle();
        if(par_content.equalsIgnoreCase("RECTANGLE"))
            return new Rectangle();
        if(par_content.equalsIgnoreCase("SQUARE"))
            return new Square();
        return null;
    }

}
