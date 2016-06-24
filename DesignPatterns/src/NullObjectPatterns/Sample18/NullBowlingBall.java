package NullObjectPatterns.Sample18;

/**
 * Created by Indi on 6/23/2016.
 */
public class NullBowlingBall extends AbstractBowlingBall {
    @Override
    boolean isNull() {
        return true;
    }

    @Override
    String getName() {
        return"No ball like this in our inventory";
    }
}
