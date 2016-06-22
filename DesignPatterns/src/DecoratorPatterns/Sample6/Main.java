package DecoratorPatterns.Sample6;

public class Main {

    public static void main(String[] args) {

        Shape c1 = new RedDecorator(new Circle());
        c1.Draw();


    }
}
