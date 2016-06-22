package NullObjectPatterns.Sample6;

public class Main {

    public static void main(String[] args) {

        AbstractPrisoner AP1 = PrisonerFactory.getPrisoner("Piper");
        AbstractPrisoner AP2 = PrisonerFactory.getPrisoner("red");
        AbstractPrisoner AP3 = PrisonerFactory.getPrisoner("George Bush");

        System.out.println(AP1.Name());
        System.out.println(AP2.Name());
        System.out.println(AP3.Name());


    }
}
