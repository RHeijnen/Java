package NullObjectPatterns.Sample15;

/**
 * Created by Indi on 6/23/2016.
 */
public class PrisonerFactory {
    String[] names = {"Charlie","Dee","Mac"};
    AbstractPrisoner prisoner(String name){
        for(int i = 0; i < names.length;i++){
            if(names[i].equalsIgnoreCase(name)){
                return new Prisoner(name);
            }
        }
        return new NullPrisoner();
    }
}
