package NullObjectPatterns.Sample1;

/**
 * Created by Indi on 6/22/2016.
 */
public class Worker extends AbstractWorker {

    public Worker(String name){
        this.name = name;
    }
    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
