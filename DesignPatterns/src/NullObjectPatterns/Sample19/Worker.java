package NullObjectPatterns.Sample19;

/**
 * Created by Indi on 6/24/2016.
 */
public class Worker extends AbstractWorker {

    public Worker(String name){
        this.name = name;
    }

    @Override
    boolean isNull() {
        return false;
    }

    @Override
    String getName() {
        return name;
    }
}
