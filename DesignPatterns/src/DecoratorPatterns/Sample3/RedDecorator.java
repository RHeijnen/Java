package DecoratorPatterns.Sample3;

/**
 * Created by Indi on 6/22/2016.
 */
public class RedDecorator extends ShapeDecorator {
    public RedDecorator(Shape decorator) {
        super(decorator);
    }

    @Override
    public void Draw(){
        decoratedShape.Draw();
        setRed(decoratedShape);
    }
    public void setRed(Shape shape){
        System.out.println("I am also red");
    }
}
