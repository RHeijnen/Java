package NullObjectPatterns.Sample15;

/**
 * Created by Indi on 6/23/2016.
 */
public class Prisoner extends AbstractPrisoner {
    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
    public Prisoner(String name){
        this.name = name;
    }
}
