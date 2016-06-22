package VisitorPatterns.Sample1;

/**
 * Created by Indi on 6/22/2016.
 */
public class VisitorDisplay implements AnimalVisitor {
    @Override
    public void visit(Animal animal) {
        System.out.println("This is an Animal");
    }

    @Override
    public void visit(Owl owl) {
        System.out.println("This is an Owl");
    }

    @Override
    public void visit(Turtle turtle) {
        System.out.println("This is an Turtle");

    }

    @Override
    public void visit(Beaver beaver) {
        System.out.println("This is an Beaver");
    }
}
