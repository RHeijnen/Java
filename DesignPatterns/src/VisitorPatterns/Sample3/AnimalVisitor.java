package VisitorPatterns.Sample3;

/**
 * Created by Indi on 6/23/2016.
 */
public interface AnimalVisitor {
    void visit(Beaver beaver);
    void visit(Animal animal);
}
