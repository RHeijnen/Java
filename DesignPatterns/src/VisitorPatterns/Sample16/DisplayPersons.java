package VisitorPatterns.Sample16;

/**
 * Created by Indi on 6/24/2016.
 */
public class DisplayPersons implements PersonVisitor {
    @Override
    public void visit(Person person) {
        System.out.printf("This is a general person");
    }

    @Override
    public void visit(Frank frank) {
        System.out.println("This is a Frank, he is a person");
    }
}
