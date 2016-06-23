package VisitorPatterns.Sample2;

/**
 * Created by Indi on 6/23/2016.
 */
public class VisitorDisplay implements AnimalVisitor{
    @Override
    public void visit(Beaver beaver) {
        System.out.println("This is a beaver");
    }

    @Override
    public void visit(Animal animal) {
        System.out.println("This is a general animal");
    }
}
