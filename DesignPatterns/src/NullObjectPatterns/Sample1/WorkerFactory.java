package NullObjectPatterns.Sample1;

/**
 * Created by Indi on 6/22/2016.
 */
public class WorkerFactory {
    public static final String[] names = {"John","Maria","Charles","Eva"};

    public static AbstractWorker getWorker(String name){
        for(int i = 0; i< names.length;i++){
            if (names[i].equalsIgnoreCase(name)){
                return new Worker(name);
            }
        }return new NullWorker();
    }
}
