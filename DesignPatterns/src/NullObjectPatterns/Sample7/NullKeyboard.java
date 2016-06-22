package NullObjectPatterns.Sample7;

/**
 * Created by Indi on 6/22/2016.
 */
public class NullKeyboard extends AbstractKeyboard {

    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public String getName() {
        return "No compatible keyboard found";
    }
}
