package NullObjectPatterns.Sample6;

/**
 * Created by Indi on 6/22/2016.
 */
public class NullPrisoner extends AbstractPrisoner {
    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public String Name() {
        return"Not a valid Prisoner name" ;
    }
}
