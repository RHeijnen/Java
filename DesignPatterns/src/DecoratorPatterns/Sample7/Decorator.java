package DecoratorPatterns.Sample7;

/**
 * Created by Indi on 6/22/2016.
 */
public abstract class Decorator implements Shape {
    protected Shape decorateditem;
    public Decorator(Shape shape){
        this.decorateditem = shape;
    }
    public void Draw(){
        decorateditem.Draw();
    }
}
