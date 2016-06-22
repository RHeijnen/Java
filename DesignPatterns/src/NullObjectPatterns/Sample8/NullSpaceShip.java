package NullObjectPatterns.Sample8;

/**
 * Created by Indi on 6/22/2016.
 */
public class NullSpaceShip extends AbstractSpaceShip {
    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public String getName() {
        return"not a valid federation ship";
    }
}
