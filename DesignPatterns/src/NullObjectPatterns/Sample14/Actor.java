package NullObjectPatterns.Sample14;

/**
 * Created by Indi on 6/23/2016.
 */
public class Actor extends AbstractActor {
    @Override
    public Boolean isNull() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
    public Actor(String name){
        this.name = name;
    }
}
