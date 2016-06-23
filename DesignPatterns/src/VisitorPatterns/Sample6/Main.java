package VisitorPatterns.Sample6;

public class Main {

    public static void main(String[] args) {

        Computer comp = new Computer();
        comp.accept(new DisplayParts());


    }
}
