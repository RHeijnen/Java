package FactoryPatterns.Sample7;

public class Main {

    public static void main(String[] args) {
    Factory fact = new Factory();
        Shape s1 = fact.getShape("rectangle");
        s1.Draw();



    }
}
