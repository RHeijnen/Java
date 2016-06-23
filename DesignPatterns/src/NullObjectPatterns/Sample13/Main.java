package NullObjectPatterns.Sample13;

public class Main {

    public static void main(String[] args) {
        Factory fact = new Factory();

        AbstractHero Hero1 = fact.getHero("Captain America");
        AbstractHero Hero2 = fact.getHero("Will Smith");

        System.out.println(Hero1.getName());
        System.out.println(Hero2.getName());


    }
}
