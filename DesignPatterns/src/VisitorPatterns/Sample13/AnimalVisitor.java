package VisitorPatterns.Sample13;

/**
 * Created by Indi on 6/24/2016.
 */
public interface AnimalVisitor {
    void visit(Animal animal);
    void visit(Fly fly);
}
