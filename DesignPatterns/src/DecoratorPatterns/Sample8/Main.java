package DecoratorPatterns.Sample8;

public class Main {

    public static void main(String[] args) {
    Animal a1 = new AnimalPainter(new Fish());
    a1.Sound();


    }
}
