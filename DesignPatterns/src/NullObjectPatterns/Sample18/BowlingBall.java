package NullObjectPatterns.Sample18;

/**
 * Created by Indi on 6/23/2016.
 */
public class BowlingBall extends AbstractBowlingBall {
    @Override
    boolean isNull() {
        return false;
    }

    @Override
    String getName() {
        return name;
    }
    public BowlingBall(String name){
        this.name = name;
    }
}
