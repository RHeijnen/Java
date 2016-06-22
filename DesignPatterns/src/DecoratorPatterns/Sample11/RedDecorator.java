package DecoratorPatterns.Sample11;

/**
 * Created by Indi on 6/22/2016.
 */
public class RedDecorator extends Decorator {
    public RedDecorator(Shape shape) {
        super(shape);
    }

    public void Draw(){
        decoratedshape.Draw();
        setColor(decoratedshape);
    }
    public void setColor(Shape shape){
        System.out.println("I am now red");
    }
}
