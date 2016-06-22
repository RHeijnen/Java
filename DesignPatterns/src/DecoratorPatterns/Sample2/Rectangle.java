package DecoratorPatterns.Sample2;

/**
 * Created by Indi on 6/22/2016.
 */
public class Rectangle implements Shape {

    @Override
    public void Draw() {
        System.out.println("I am a Rectangle");
    }
}
