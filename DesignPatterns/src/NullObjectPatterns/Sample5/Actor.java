package NullObjectPatterns.Sample5;

/**
 * Created by Indi on 6/22/2016.
 */
public class Actor extends AbstractActor {
    public Actor(String name){
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
