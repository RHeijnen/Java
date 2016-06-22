package DecoratorPatterns.Sample9;

/**
 * Created by Indi on 6/22/2016.
 */
public class RedDecorator extends Decorator {
    public RedDecorator(Shape shape) {
        super(shape);
    }
    public void setRed(Shape shape){
        System.out.println(" I am now red");
    }
    public void Draw(){
        decoratedShape.Draw();
        setRed(decoratedShape);
    }
}
