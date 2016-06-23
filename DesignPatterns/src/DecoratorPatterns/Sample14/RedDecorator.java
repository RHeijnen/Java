package DecoratorPatterns.Sample14;

/**
 * Created by Indi on 6/23/2016.
 */
public class RedDecorator extends Decorator {
    public RedDecorator(Shape shape) {
        super(shape);
    }

    public void redColor(Shape shape){
        System.out.println("I got painted RED");
    }
    public void Draw(){
        decoratedShape.Draw();
        redColor(decoratedShape);
    }
}
