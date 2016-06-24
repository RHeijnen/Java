package DecoratorPatterns.Sample20;

/**
 * Created by Indi on 6/23/2016.
 */
public class RedDecorator extends Decorator {
    public void Draw(){
        decoratedShape.Draw();
        setRed(decoratedShape);
    }
    public void setRed(Shape shape){
        System.out.println("Colored Red");
    }
    public RedDecorator(Shape shape) {
        super(shape);
    }
}
