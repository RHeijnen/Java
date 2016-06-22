package NullObjectPatterns.Sample4;

public class Main {

    public static void main(String[] args) {

        AbstractPerson AP1 = PersonFactory.Person("Hello");
        AbstractPerson AP2 = PersonFactory.Person("my");
        AbstractPerson AP3 = PersonFactory.Person("Name");
        AbstractPerson AP4 = PersonFactory.Person("is");
        AbstractPerson AP5 = PersonFactory.Person("BooBoo");

        System.out.println(AP1.getName());
        System.out.println(AP2.getName());
        System.out.println(AP3.getName());
        System.out.println(AP4.getName());
        System.out.println(AP5.getName());

    }
}
