package FactoryPatterns.Sample9;

public class Main {

    public static void main(String[] args) {

        ShapeFactory sf = new ShapeFactory();
        Shape shape1 = sf.getShape("star");
        Shape shape2 = sf.getShape("square");
        shape1.Draw();
        shape2.Draw();


    }
}
