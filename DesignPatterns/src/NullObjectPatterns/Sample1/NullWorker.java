package NullObjectPatterns.Sample1;

/**
 * Created by Indi on 6/22/2016.
 */
public class NullWorker extends AbstractWorker {
    @Override
    public boolean isNil() {
        return true;
    }

    @Override
    public String getName() {
        return "Not a known person";
    }
}
