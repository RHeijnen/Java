package VisitorPatterns.Sample13;

/**
 * Created by Indi on 6/24/2016.
 */
public class Fly implements AnimalType {
    @Override
    public void accept(AnimalVisitor animalVisitor) {
        animalVisitor.visit(this);
    }
}
