package DecoratorPatterns.Sample2;

/**
 * Created by Indi on 6/22/2016.
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape shape){
        this.decoratedShape = shape;

    }
    public void Draw(){
        decoratedShape.Draw();
    }


}
