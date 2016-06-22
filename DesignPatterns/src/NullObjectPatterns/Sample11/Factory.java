package NullObjectPatterns.Sample11;

/**
 * Created by Indi on 6/22/2016.
 */
public class Factory {
    String[] prisoners = {"1","2","3"};
    AbstractPrisoner findPrisoner(String name){
        for(int i = 0; i < prisoners.length;i++){
            if(prisoners[i].equalsIgnoreCase(name)){
                return new Prisoner(name);
            }
        }return new NullPrisoner();
    }
}
