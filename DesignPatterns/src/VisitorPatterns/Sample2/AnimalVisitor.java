package VisitorPatterns.Sample2;

/**
 * Created by Indi on 6/23/2016.
 */
public interface AnimalVisitor {
    public void visit(Beaver beaver);
    public void visit(Animal animal);
}
