package NullObjectPatterns.Sample17;

/**
 * Created by Indi on 6/23/2016.
 */
public class Actor extends AbstractActor {
    @Override
    boolean isNull() {
        return false;
    }

    @Override
    String getString() {
        return name;
    }
    public Actor(String name){
        this.name = name;
    }
}
