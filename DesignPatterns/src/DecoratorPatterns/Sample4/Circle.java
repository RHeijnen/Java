package DecoratorPatterns.Sample4;

/**
 * Created by Indi on 6/22/2016.
 */
public class Circle implements Shape {
    @Override
    public void Draw() {
        System.out.println("I am a circle");
    }
}
