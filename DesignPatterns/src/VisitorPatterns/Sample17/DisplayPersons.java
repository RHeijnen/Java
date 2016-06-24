package VisitorPatterns.Sample17;

/**
 * Created by Indi on 6/24/2016.
 */
public class DisplayPersons implements PersonVisitor {
    @Override
    public void visit(Frank frank) {
        System.out.println("meet Frank, he is a person");
    }

    @Override
    public void visit(Person person) {
        System.out.println("meet person guy, he is also a person");
    }
}
