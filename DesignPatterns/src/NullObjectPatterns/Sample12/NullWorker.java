package NullObjectPatterns.Sample12;

/**
 * Created by Indi on 6/22/2016.
 */
public class NullWorker extends AbstractWorker {

    @Override
    boolean isNull() {
        return true;
    }

    @Override
    String getName() {
        return "This is not a valid name";
    }
}
