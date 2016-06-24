package DecoratorPatterns.Sample27;

public class Main {

    public static void main(String[] args) {


        Shape s1 = new Star();
        s1.Draw();
        Shape s2 = new RedDecorator(new Star());
        s2.Draw();



    }
}
