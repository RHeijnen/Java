package VisitorPatterns.Sample15;

/**
 * Created by Indi on 6/24/2016.
 */
public interface PersonVisitor {
    void visit(Frank frank);
    void visit(Person person);
}
