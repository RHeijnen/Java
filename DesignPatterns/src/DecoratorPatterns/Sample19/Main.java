package DecoratorPatterns.Sample19;

public class Main {

    public static void main(String[] args) {

        Shape s1 = new RedDecorator(new Star());
        s1.Draw();


    }
}
