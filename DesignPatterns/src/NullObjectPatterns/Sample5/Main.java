package NullObjectPatterns.Sample5;

public class Main {

    public static void main(String[] args) {
        AbstractActor AA1 = ActorFactory.Actor("Brad Pitt");
        System.out.println(AA1.getName());

        AbstractActor AA2 = ActorFactory.Actor("George Brug");
        System.out.println(AA2.getName());


    }
}
