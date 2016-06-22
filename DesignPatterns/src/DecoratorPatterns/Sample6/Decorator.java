package DecoratorPatterns.Sample6;

/**
 * Created by Indi on 6/22/2016.
 */
public abstract class Decorator implements Shape {
    protected Shape decoratedshape;

    public Decorator(Shape shape){
        this.decoratedshape = shape;
    }
    public void Draw(){
        decoratedshape.Draw();
    }
}
