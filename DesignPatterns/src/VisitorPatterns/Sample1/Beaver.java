package VisitorPatterns.Sample1;

/**
 * Created by Indi on 6/22/2016.
 */
public class Beaver implements AnimalType {
    @Override
    public void accept(AnimalVisitor animalVisitor) {
        animalVisitor.visit(this);
    }
}
