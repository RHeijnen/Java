package FactoryPatterns.Sample5;

public class Main {

    public static void main(String[] args) {

        Factory factory = new Factory();
        Shape shape1 = factory.getShape("star");
        Shape shape2 = factory.getShape("rectangle");
        Shape shape3 = factory.getShape("CIRCLE");

        shape1.Draw();
        shape2.Draw();
        shape3.Draw();



    }
}
