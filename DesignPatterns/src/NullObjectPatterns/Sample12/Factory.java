package NullObjectPatterns.Sample12;

/**
 * Created by Indi on 6/22/2016.
 */
public class Factory {
    String[] workers ={"Bob","Ross"};
    AbstractWorker Worker(String name){
        for(int i =0;i<workers.length;i++){
            if(workers[i].equalsIgnoreCase(name)){
                return new Worker(name);
            }

        }return new NullWorker();
    }
}
