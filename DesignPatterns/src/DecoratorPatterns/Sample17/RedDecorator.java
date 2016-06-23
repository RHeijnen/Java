package DecoratorPatterns.Sample17;

/**
 * Created by Indi on 6/23/2016.
 */
public class RedDecorator extends Decorator {
    public RedDecorator(Shape shape) {
        super(shape);
    }
    public void setRed(Shape shape){
        System.out.println("I am now red colored");
    }
    public void Draw(){
        decoratedShape.Draw();
        setRed(decoratedShape);
    }
}
