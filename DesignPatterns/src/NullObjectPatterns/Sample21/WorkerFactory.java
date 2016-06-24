package NullObjectPatterns.Sample21;

/**
 * Created by Indi on 6/24/2016.
 */
public class WorkerFactory {

    String[] names = {"bob","jenny","harold"};
    AbstractWorker getWorker(String name){
        for(int i=0; i < names.length;i++){
            if(names[i].equalsIgnoreCase(name)){
                return new Worker(name);
            }
        }return new NullWorker();
    }
}
