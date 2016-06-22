package FactoryPatterns.Sample3;

public class Main {

    public static void main(String[] args) {
        Factory fact = new Factory();
        Shape shape1 = fact.getShape("Square");
        shape1.Draw();
    }
}
