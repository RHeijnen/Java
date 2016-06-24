package DecoratorPatterns.Sample25;

public class Main {

    public static void main(String[] args) {

        Shape s1 = new Star();
        Shape s2 = new RedDecorator(new Star());
        s1.Draw();
        s2.Draw();



    }
}
