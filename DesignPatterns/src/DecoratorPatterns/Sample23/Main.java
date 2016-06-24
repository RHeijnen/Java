package DecoratorPatterns.Sample23;

public class Main {

    public static void main(String[] args) {

    Shape s1 = new RedDecorator(new Rectangle());
        s1.Draw();


    }
}
