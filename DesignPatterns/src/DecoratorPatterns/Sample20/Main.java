package DecoratorPatterns.Sample20;

public class Main {

    public static void main(String[] args) {

    Shape shape1 = new RedDecorator(new Rectangle());
        shape1.Draw();


    }
}
