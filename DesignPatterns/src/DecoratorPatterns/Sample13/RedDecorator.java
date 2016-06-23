package DecoratorPatterns.Sample13;

/**
 * Created by Indi on 6/23/2016.
 */
public class RedDecorator extends Decorator {
    public RedDecorator(Shape shape) {
        super(shape);
    }
    public void setColor(Shape shape){
        System.out.println("I am now Red");
    }
    @Override
    public void Draw() {
        decoratedShape.Draw();
        setColor(decoratedShape);
    }
}
