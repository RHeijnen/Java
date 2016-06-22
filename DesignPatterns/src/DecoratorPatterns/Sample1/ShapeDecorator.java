package DecoratorPatterns.Sample1;

/**
 * Created by Indi on 6/22/2016.
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;
    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void Draw(){
        decoratedShape.Draw();
    }
}
