package NullObjectPatterns.Sample17;

/**
 * Created by Indi on 6/23/2016.
 */
public class NullActor extends AbstractActor {
    @Override
    boolean isNull() {
        return true;
    }

    @Override
    String getString() {
        return "Not a valid prisoner name";
    }
}
