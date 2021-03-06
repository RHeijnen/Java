package NullObjectPatterns.Sample19;

/**
 * Created by Indi on 6/24/2016.
 */
public class WorkerFactory {

    String[] names = {"Bob","John"};
    AbstractWorker getWorker(String name){
        for(int i = 0; i < names.length;i++) {
            if (names[i].equalsIgnoreCase(name)) {
                return new Worker(name);
            }
        }return new NullWorker();
    }
}
