package DecoratorPatterns.Sample21;

/**
 * Created by Indi on 6/24/2016.
 */
public class RedDecorator extends Decorator {

    void setRed( Shape shape){
        System.out.println("I am now red");
    }
    public void Draw(){
        decoratedShape.Draw();
        setRed(decoratedShape);
    }

    public RedDecorator(Shape shape) {
        super(shape);
    }
}
