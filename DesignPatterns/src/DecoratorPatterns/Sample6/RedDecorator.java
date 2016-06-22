package DecoratorPatterns.Sample6;

/**
 * Created by Indi on 6/22/2016.
 */
public class RedDecorator extends Decorator {

    public RedDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void Draw(){
        decoratedshape.Draw();
        Color(decoratedshape);
    }
    
    public void Color(Shape shape){
        System.out.println("I am now red");
    }
}
