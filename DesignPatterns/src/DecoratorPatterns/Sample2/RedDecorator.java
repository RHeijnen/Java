package DecoratorPatterns.Sample2;

/**
 * Created by Indi on 6/22/2016.
 */
public class RedDecorator extends ShapeDecorator {
    public RedDecorator(Shape shape) {
        super(shape);
    }
    @Override
    public void Draw() {
        decoratedShape.Draw();
        setColor(decoratedShape);
    }
    public void setColor(Shape shape){
        System.out.println("I am a red shape");
    }

}
