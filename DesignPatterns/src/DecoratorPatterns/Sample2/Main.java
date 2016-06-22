package DecoratorPatterns.Sample2;

public class Main {

    public static void main(String[] args) {

        Shape c1 = new Circle();
        Shape c2 = new Square();
        Shape c3 = new RedDecorator(new Circle());
        c1.Draw();
        c2.Draw();
        c3.Draw();

    }
}
