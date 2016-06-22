package DecoratorPatterns.Sample4;

public class Main {

    public static void main(String[] args) {

         Shape c1 = new Circle();
         c1.Draw();
         Shape c2 = new RedDecorator(new Circle());
         c2.Draw();


    }
}
