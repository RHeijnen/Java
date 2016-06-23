package NullObjectPatterns.Sample16;

/**
 * Created by Indi on 6/23/2016.
 */
public class NullPrisoner extends AbstractPrisoner {
    @Override
    boolean isNull() {
        return true;
    }

    @Override
    String getName() {
        return "Not a valid name";
    }
}
