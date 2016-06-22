package DecoratorPatterns.Sample7;

/**
 * Created by Indi on 6/22/2016.
 */
public class RedDecorator extends Decorator {
    public RedDecorator(Shape shape) {
        super(shape);
    }

    public void Draw(){
        decorateditem.Draw();
        SetColor(decorateditem);
    }
    public void SetColor(Shape shape){
        System.out.println("That is Red");
    }
}
