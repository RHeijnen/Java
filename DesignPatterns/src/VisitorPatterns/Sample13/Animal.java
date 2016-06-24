package VisitorPatterns.Sample13;

/**
 * Created by Indi on 6/24/2016.
 */
public class Animal implements AnimalType {

    AnimalType[] types;

    public Animal(){
        types = new AnimalType[]{new Fly()};
    }

    @Override
    public void accept(AnimalVisitor animalVisitor) {
        for (int i = 0; i < types.length;i++){
            types[i].accept(animalVisitor);
        }
        animalVisitor.visit(this);
    }
}
