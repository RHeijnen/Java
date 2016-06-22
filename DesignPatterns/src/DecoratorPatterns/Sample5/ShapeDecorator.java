package DecoratorPatterns.Sample5;

/**
 * Created by Indi on 6/22/2016.
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedshape;
    public ShapeDecorator(Shape shape){
        this.decoratedshape = shape;
    }
    public void Draw(){
        decoratedshape.Draw();
    }

}
