package NullObjectPatterns.Sample10;

/**
 * Created by Indi on 6/22/2016.
 */
public class LeagueSummoner extends AbstractLeagueSummoner {

    public LeagueSummoner(String name){
        this.name = name;
    }
    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
