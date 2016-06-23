package DecoratorPatterns.Sample18;

public class Main {

    public static void main(String[] args) {

        Shape s1 = new RedDecorator(new Square());
        s1.Draw();


    }
}
