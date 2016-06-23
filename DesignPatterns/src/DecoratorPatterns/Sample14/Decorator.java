package DecoratorPatterns.Sample14;

/**
 * Created by Indi on 6/23/2016.
 */
public abstract class Decorator implements Shape {
    public Shape decoratedShape;

    public Decorator(Shape shape){
        this.decoratedShape = shape;
    }
    public void Draw(){
        decoratedShape.Draw();
    }
}
