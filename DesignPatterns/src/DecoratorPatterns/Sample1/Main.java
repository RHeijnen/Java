package DecoratorPatterns.Sample1;

public class Main {

    public static void main(String[] args) {

        Shape c1 = new Circle();
        Shape red1 = new RedShapeDecorator(new Circle());
        Shape red2 = new RedShapeDecorator(new Square());
        c1.Draw();
        red1.Draw();
        red2.Draw();

    }
}
