package DecoratorPatterns.Sample8;

/**
 * Created by Indi on 6/22/2016.
 */
public abstract class Decorator implements Animal{
    protected Animal decoratedAnimal;

    public Decorator(Animal animal){
        this.decoratedAnimal = animal;
    }
    public void Sound(){
        decoratedAnimal.Sound();
    }

}
