package VisitorPatterns.Sample4;

/**
 * Created by Indi on 6/23/2016.
 */
public interface AnimalVisitor {
    void Visit(Beaver beaver);
    void Visit(Animal animal);
}
