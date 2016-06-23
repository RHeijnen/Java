package NullObjectPatterns.Sample14;

public class Main {

    public static void main(String[] args) {

    ActorFactory fact = new ActorFactory();
    AbstractActor actor1 = fact.actor("bob");
        System.out.println(actor1.getName());



    }
}
