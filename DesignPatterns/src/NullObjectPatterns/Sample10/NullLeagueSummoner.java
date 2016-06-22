package NullObjectPatterns.Sample10;

/**
 * Created by Indi on 6/22/2016.
 */
public class NullLeagueSummoner extends AbstractLeagueSummoner {
    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public String getName() {
        return" No summoner found with that name";
    }
}
