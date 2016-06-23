package NullObjectPatterns.Sample16;

/**
 * Created by Indi on 6/23/2016.
 */
public class Prisoner extends AbstractPrisoner{
    @Override
    boolean isNull() {
        return false;
    }

    @Override
    String getName() {
        return name;
    }
    public Prisoner(String name){
        this.name = name;
    }
}
