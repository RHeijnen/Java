package FactoryPatterns.Sample10;

public class Main {

    public static void main(String[] args) {


    ShapeFactory sf = new ShapeFactory();
        Shape s1 = sf.getShape("star");
        Shape s2 = sf.getShape("Square");
        s1.Draw();
        s2.Draw();
    }
}
