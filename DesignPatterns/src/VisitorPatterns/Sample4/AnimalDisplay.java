package VisitorPatterns.Sample4;

/**
 * Created by Indi on 6/23/2016.
 */
public class AnimalDisplay implements AnimalVisitor {
    @Override
    public void Visit(Beaver beaver) {
        System.out.println("This is a beaver");
    }

    @Override
    public void Visit(Animal animal) {
        System.out.println("We dont know what this is");
    }
}
