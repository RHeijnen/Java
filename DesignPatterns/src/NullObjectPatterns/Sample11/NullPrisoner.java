package NullObjectPatterns.Sample11;

/**
 * Created by Indi on 6/22/2016.
 */
public class NullPrisoner extends AbstractPrisoner {
    @Override
    boolean isNull() {
        return true;
    }

    @Override
    String getName() {
        return"There is no prisone found with that name";
    }
}
