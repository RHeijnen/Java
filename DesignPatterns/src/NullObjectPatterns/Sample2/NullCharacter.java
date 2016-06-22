package NullObjectPatterns.Sample2;

/**
 * Created by Indi on 6/22/2016.
 */
public class NullCharacter extends AbstractCharacter {

    @Override
    public boolean isNil() {
        return true;
    }

    @Override
    public String getName() {
        return "There is no character by this name";
    }
}
