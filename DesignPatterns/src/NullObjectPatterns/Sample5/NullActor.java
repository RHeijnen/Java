package NullObjectPatterns.Sample5;

/**
 * Created by Indi on 6/22/2016.
 */
public class NullActor extends AbstractActor {

    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public String getName() {
        return "This person might not be famous enough";
    }
}
