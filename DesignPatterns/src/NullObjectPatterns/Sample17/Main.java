package NullObjectPatterns.Sample17;

public class Main {

    public static void main(String[] args) {


    ActorFactory af = new ActorFactory();
        AbstractActor aa1 = af.actor("John");
        AbstractActor aa2 = af.actor("Bob");
        AbstractActor aa3 = af.actor("Dean");
        System.out.println(aa1.getString());
        System.out.println(aa2.getString());
        System.out.println(aa3.getString());


    }
}
