package DecoratorPatterns.Sample10;

/**
 * Created by Indi on 6/22/2016.
 */
public class RedDecorator extends Decorator {
    public RedDecorator(Shape shape) {
        super(shape);
    }

    public void setRed(Shape shape){
        System.out.println("With red stripes");
    }
    public void Draw(){
        decoratedShape.Draw();
        setRed(decoratedShape);
    }
}
