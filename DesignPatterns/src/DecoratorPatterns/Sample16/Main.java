package DecoratorPatterns.Sample16;

public class Main {

    public static void main(String[] args) {

        Shape shape1 = new RedDecorator(new Star());
        shape1.Draw();



    }
}
