package DecoratorPatterns.Sample17;

/**
 * Created by Indi on 6/23/2016.
 */
public abstract class Decorator implements Shape {
    Shape decoratedShape;
    public Decorator(Shape shape){
        this.decoratedShape = shape;
    }
    public void Draw(){
        decoratedShape.Draw();
    }
}
