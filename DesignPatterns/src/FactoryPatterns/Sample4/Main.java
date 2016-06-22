package FactoryPatterns.Sample4;

public class Main {

    public static void main(String[] args) {

        Factory factory = new Factory();
        Shape shape1 = factory.getShape("square");
        shape1.Draw();
    }
}
