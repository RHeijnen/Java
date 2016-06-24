package VisitorPatterns.Sample16;

/**
 * Created by Indi on 6/24/2016.
 */
public interface PersonVisitor {
    void visit(Person person);
    void visit(Frank frank);
}
