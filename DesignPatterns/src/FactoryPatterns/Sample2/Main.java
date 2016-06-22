package FactoryPatterns.Sample2;

public class Main {

    public static void main(String[] args) {
        Factory factory = new Factory();
        Shape shape1 = factory.getShape("star");
        Shape shape2 = factory.getShape("circle");
        shape1.Draw();
        shape2.Draw();

    }
}
