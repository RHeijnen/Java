package VisitorPatterns.Sample2;

/**
 * Created by Indi on 6/23/2016.
 */
public class Beaver implements AnimalType {
    @Override
    public void accept(AnimalVisitor animalVisitor) {
        animalVisitor.visit(this);
    }
}
