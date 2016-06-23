package NullObjectPatterns.Sample13;

/**
 * Created by Indi on 6/23/2016.
 */
public class NullHero extends AbstractHero {
    @Override
    public Boolean isNull() {
        return true;
    }

    @Override
    public String getName() {
        return "Not a valid hero name";
    }
}
