package DecoratorPatterns.Sample19;

/**
 * Created by Indi on 6/23/2016.
 */
public abstract class Decorator implements Shape{
    Shape decratedShape;
    public Decorator(Shape shape){
        this.decratedShape = shape;
    }

    public void Draw(){
        decratedShape.Draw();
    }
}
