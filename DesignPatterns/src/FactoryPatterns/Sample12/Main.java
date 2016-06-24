package FactoryPatterns.Sample12;

public class Main {

    public static void main(String[] args) {

        ShapeFactory sf = new ShapeFactory();
        Shape s1 = sf.getShape("star");
        Shape s2 = sf.getShape("rectangle");
        s1.Draw();
        s2.Draw();

    }
}
