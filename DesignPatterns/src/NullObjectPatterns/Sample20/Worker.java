package NullObjectPatterns.Sample20;

/**
 * Created by Indi on 6/24/2016.
 */
public class Worker extends AbstractWorker {
    @Override
    boolean isNull() {
        return false;
    }

    @Override
    String getName() {
        return name;
    }
    public Worker(String name){
        this.name = name;
    }
}
