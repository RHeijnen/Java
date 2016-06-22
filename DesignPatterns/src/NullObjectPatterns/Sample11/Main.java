package NullObjectPatterns.Sample11;

public class Main {

    public static void main(String[] args) {

    Factory fact = new Factory();
        AbstractPrisoner prisoner1 = fact.findPrisoner("bob");
        AbstractPrisoner prisoner2 = fact.findPrisoner("1");
        System.out.println(prisoner1.getName());
        System.out.println(prisoner2.getName());



    }
}
