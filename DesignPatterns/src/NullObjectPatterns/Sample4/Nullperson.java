package NullObjectPatterns.Sample4;

/**
 * Created by Indi on 6/22/2016.
 */
public class Nullperson extends AbstractPerson {

    @Override
    public boolean isNill() {
        return true;
    }

    @Override
    public String getName() {
        return"This person is not found in our database";
    }
}
