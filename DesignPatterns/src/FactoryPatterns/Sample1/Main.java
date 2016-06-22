package FactoryPatterns.Sample1;

public class Main {

    public static void main(String[] args) {

        Factory shapeFactory = new Factory();

        Shape shape1 = shapeFactory.getShape("Circle");
        shape1.Draw();


    }
}
