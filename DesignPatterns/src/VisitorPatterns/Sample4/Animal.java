package VisitorPatterns.Sample4;

/**
 * Created by Indi on 6/23/2016.
 */
public class Animal implements AnimalType {
    AnimalType[] animalTypes;

    public Animal(){
        animalTypes = new AnimalType[]{new Beaver()};
    }
    @Override
    public void accept(AnimalVisitor animalVisitor) {
        for(int i =0; i< animalTypes.length;i++){
            animalTypes[i].accept(animalVisitor);
        }
        animalVisitor.Visit(this);
    }
}
