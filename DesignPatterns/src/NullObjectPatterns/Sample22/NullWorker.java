package NullObjectPatterns.Sample22;

/**
 * Created by Indi on 6/24/2016.
 */
public class NullWorker extends AbstractWorker {
    @Override
    boolean isNull() {
        return true;
    }

    @Override
    String getName() {
        return "Not a valid name";
    }
}
