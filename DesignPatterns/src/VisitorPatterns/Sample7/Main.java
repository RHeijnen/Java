package VisitorPatterns.Sample7;

public class Main {

    public static void main(String[] args) {


         Computer computer = new Computer();
        computer.accept(new DisplayParts());

    }
}
