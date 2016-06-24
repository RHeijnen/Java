package DecoratorPatterns.Sample21;

public class Main {

    public static void main(String[] args) {


        Shape c1 = new Star();
        c1.Draw();
        Shape c2 = new RedDecorator(new Star());
        c2.Draw();

    }
}
