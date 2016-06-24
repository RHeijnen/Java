package DecoratorPatterns.Sample24;

import DecoratorPatterns.Sample9.*;

/**
 * Created by Indi on 6/24/2016.
 */
public class RedDecorator extends Decorator {
    public void Draw(){
        decoratedShape.Draw();
        setRed(decoratedShape);
    }

    public void setRed(Shape shape){
        System.out.println("I am now RED");
    }

    public RedDecorator(Shape shape) {
        super(shape);
    }
}
