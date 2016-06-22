package DecoratorPatterns.Sample5;

/**
 * Created by Indi on 6/22/2016.
 */
public class RedDecorator extends ShapeDecorator {

    public RedDecorator(Shape shape) {
        super(shape);
    }
    public void Draw(){
        decoratedshape.Draw();
        setRed(decoratedshape);
    }
    public void setRed(Shape shape){
        System.out.println("I am now red");
    }
}
