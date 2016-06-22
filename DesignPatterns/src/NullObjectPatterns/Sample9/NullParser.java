package NullObjectPatterns.Sample9;

/**
 * Created by Indi on 6/22/2016.
 */
public class NullParser extends AbstractParser {

    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public String getType() {
        return "Not a valid type";
    }
}
