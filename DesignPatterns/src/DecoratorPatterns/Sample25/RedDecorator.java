package DecoratorPatterns.Sample25;


/**
 * Created by Indi on 6/24/2016.
 */
public class RedDecorator extends Decorator {

    public void Draw(){
        decoratedItem.Draw();
        setRed(decoratedItem);
    }
    public void setRed(Shape shape){
        System.out.println("I am now red");
    }
    public RedDecorator(Shape shape) {
        super(shape);
    }
}
