package NullObjectPatterns.Sample15;

/**
 * Created by Indi on 6/23/2016.
 */
public class NullPrisoner extends AbstractPrisoner {
    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public String getName() {
        return "No prisoner with that name found";
    }
}
