package FactoryPatterns.Sample6;

public class Main {

    public static void main(String[] args) {

    ShapeFactory sf = new ShapeFactory();
        Shape shape1 = sf.getShape("Circle");
        shape1.Draw();


    }
}
