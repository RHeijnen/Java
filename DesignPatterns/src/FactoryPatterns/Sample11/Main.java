package FactoryPatterns.Sample11;

public class Main {

    public static void main(String[] args) {

    ShapeFactory sf = new ShapeFactory();
        Shape shape1 = sf.getShape("Star");
        Shape shape2 = sf.getShape("CIrCLE");
        shape1.Draw();
        shape2.Draw();


    }
}
