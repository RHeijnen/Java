package NullObjectPatterns.Sample2;

public class Main {

    public static void main(String[] args) {
        AbstractCharacter character1 = CharacterFactory.getCharacter("41");
        AbstractCharacter character2 = CharacterFactory.getCharacter("The Monarch");
        AbstractCharacter character3 = CharacterFactory.getCharacter("Bowie");

        System.out.println(character1.getName());
        System.out.println(character2.getName());
        System.out.println(character3.getName());

    }
}
