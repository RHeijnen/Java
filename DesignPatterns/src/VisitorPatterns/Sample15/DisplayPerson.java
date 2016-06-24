package VisitorPatterns.Sample15;

/**
 * Created by Indi on 6/24/2016.
 */
public class DisplayPerson implements PersonVisitor {
    @Override
    public void visit(Frank frank) {
        System.out.println("Meet Frank, he is A person");
    }

    @Override
    public void visit(Person person) {
        System.out.println("meer generic person guy, he is a person");
    }
}
