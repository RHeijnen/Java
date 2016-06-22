package DecoratorPatterns.Sample8;


/**
 * Created by Indi on 6/22/2016.
 */
public class AnimalPainter extends Decorator {
    public AnimalPainter(Animal animal) {
        super(animal);
    }
    public void Sound(){
        decoratedAnimal.Sound();
        SetColor(decoratedAnimal);
    }
    public void SetColor(Animal animal){
        System.out.println("I JUST GOT PAINTED");
    }
}
