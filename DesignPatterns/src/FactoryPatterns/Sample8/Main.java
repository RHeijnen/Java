package FactoryPatterns.Sample8;

public class Main {

    public static void main(String[] args) {


    ShapeFactory fact = new ShapeFactory();
        Shape s1 = fact.getShape("Star");
        s1.Draw();
        Shape s2 = fact.getShape("Square");
        s2.Draw();
    }
}
