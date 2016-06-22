package VisitorPatterns.Sample1;

/**
 * Created by Indi on 6/22/2016.
 */
public class Animal implements AnimalType {
    AnimalType[] animalTypes;
    public Animal(){
        animalTypes = new AnimalType[] {new Beaver(),new Owl(),new Turtle()};
    }
    @Override
    public void accept(AnimalVisitor animalVisitor) {
        for(int i = 0; i < animalTypes.length;i++) {
            animalTypes[i].accept(animalVisitor);
        }
        animalVisitor.visit(this);
    }
}

