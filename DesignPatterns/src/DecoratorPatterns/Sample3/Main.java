package DecoratorPatterns.Sample3;

public class Main {

    public static void main(String[] args) {


        Shape S1 = new Circle();
        Shape S2 = new RedDecorator(new Rectangle());
                S1.Draw();
                S2.Draw();

    }
}
