package NullObjectPatterns.Sample16;

public class Main {

    public static void main(String[] args) {

        PrisonerFactory fact = new PrisonerFactory();
        AbstractPrisoner pris1 = fact.getPrisoner("Bob");
        System.out.println(pris1.getName());
        AbstractPrisoner pris2 = fact.getPrisoner("George");
        System.out.println(pris2.getName());



    }
}
