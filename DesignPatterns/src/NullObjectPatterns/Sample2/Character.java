package NullObjectPatterns.Sample2;

/**
 * Created by Indi on 6/22/2016.
 */
public class Character extends AbstractCharacter {
    public Character(String name){
        this.name = name;
    }

    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
