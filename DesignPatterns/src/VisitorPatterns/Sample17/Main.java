package VisitorPatterns.Sample17;

public class Main {

    public static void main(String[] args) {

    Person person = new Person();
        person.accept(new DisplayPersons());


    }
}
