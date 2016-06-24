package DecoratorPatterns.Sample26;

/**
 * Created by Indi on 6/24/2016.
 */
public class RedDecorator extends Decorator {

    public void setRed(Shape shape){
        System.out.println("I am now red");
    }

    public void Draw(){
        decoratedItem.Draw();
        setRed(decoratedItem);
    }
    public RedDecorator(Shape shape) {
        super(shape);
    }
}
