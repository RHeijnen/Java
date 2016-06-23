package NullObjectPatterns.Sample14;

/**
 * Created by Indi on 6/23/2016.
 */
public class NullActor extends AbstractActor {
    @Override
    public Boolean isNull() {
        return true;
    }

    @Override
    public String getName() {
        return "Not a valid actor name";
    }
}
