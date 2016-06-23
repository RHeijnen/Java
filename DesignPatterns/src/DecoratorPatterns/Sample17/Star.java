package DecoratorPatterns.Sample17;

/**
 * Created by Indi on 6/23/2016.
 */
public class Star implements Shape {
    @Override
    public void Draw() {
        System.out.println("I am a star");
    }
}
