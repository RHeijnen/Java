package DecoratorPatterns.Sample1;

/**
 * Created by Indi on 6/22/2016.
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }
    @Override
    public void Draw() {
        decoratedShape.Draw();
        setColor(decoratedShape);
    }

    private void setColor(Shape decoratedShape){
        System.out.println("I am Red");
    }


}

