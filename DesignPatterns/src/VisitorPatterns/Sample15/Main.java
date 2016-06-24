package VisitorPatterns.Sample15;

public class Main {

    public static void main(String[] args) {

        Person person = new Person();
        person.accept(new DisplayPerson());



    }
}
