package VisitorPatterns.Sample13;

/**
 * Created by Indi on 6/24/2016.
 */
public class DisplayAnimals implements AnimalVisitor {
    @Override
    public void visit(Animal animal) {
        System.out.println("this is an animal");
    }

    @Override
    public void visit(Fly fly) {
        System.out.println("buz buz ");
    }
}
