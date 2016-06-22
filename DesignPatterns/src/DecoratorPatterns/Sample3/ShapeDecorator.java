package DecoratorPatterns.Sample3;

/**
 * Created by Indi on 6/22/2016.
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decorator){
        this.decoratedShape = decorator;
    }
    public void Draw(){
        decoratedShape.Draw();
    }
}
