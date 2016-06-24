package DecoratorPatterns.Sample26;

/**
 * Created by Indi on 6/24/2016.
 */
public abstract class Decorator implements Shape {
    Shape decoratedItem;
    public Decorator(Shape shape){
        this.decoratedItem = shape;
    }
    public void Draw(){
        decoratedItem.Draw();
    }
}
