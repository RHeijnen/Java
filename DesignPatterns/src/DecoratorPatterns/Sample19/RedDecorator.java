package DecoratorPatterns.Sample19;

/**
 * Created by Indi on 6/23/2016.
 */
public class RedDecorator extends Decorator {
    public void Draw(){
        decratedShape.Draw();
        redColor(decratedShape);
    }

    public void redColor(Shape shape){
        System.out.println("I am red");
    }
    public RedDecorator(Shape shape) {
        super(shape);
    }
}
