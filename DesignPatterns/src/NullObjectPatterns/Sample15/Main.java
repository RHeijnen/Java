package NullObjectPatterns.Sample15;

public class Main {

    public static void main(String[] args) {

    PrisonerFactory pf = new PrisonerFactory();
        AbstractPrisoner p1 = pf.prisoner("Charlie");
        System.out.println(p1.getName());

        AbstractPrisoner p2 = pf.prisoner("Megatron");
        System.out.println(p2.getName());

    }
}
