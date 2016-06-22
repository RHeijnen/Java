package NullObjectPatterns.Sample6;

/**
 * Created by Indi on 6/22/2016.
 */
public class Prisoner extends AbstractPrisoner {
    public Prisoner(String name){
        this.name = name;
    }
    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public String Name() {
        return name;
    }
}
