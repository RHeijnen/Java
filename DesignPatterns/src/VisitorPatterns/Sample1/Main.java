package VisitorPatterns.Sample1;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.accept(new VisitorDisplay());

    }
}
