package DecoratorPatterns.Sample18;

/**
 * Created by Indi on 6/23/2016.
 */
public class RedDecorator extends Decorator {

    public void Draw(){
        decoratedShape.Draw();
        setColor(decoratedShape);
    }
    public void setColor(Shape shape){
        System.out.println("I am now a red color");
    }
    public RedDecorator(Shape shape) {
        super(shape);
    }
}
