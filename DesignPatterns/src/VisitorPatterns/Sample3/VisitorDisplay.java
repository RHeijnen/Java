package VisitorPatterns.Sample3;

/**
 * Created by Indi on 6/23/2016.
 */
public class VisitorDisplay implements AnimalVisitor {
    @Override
    public void visit(Beaver beaver) {
        System.out.println("this is a beaver");
    }

    @Override
    public void visit(Animal animal) {
        System.out.println("We dont know what this is, but it is an animal for sure");
    }
}
