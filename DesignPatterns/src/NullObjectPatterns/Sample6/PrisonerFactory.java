package NullObjectPatterns.Sample6;

/**
 * Created by Indi on 6/22/2016.
 */
public class PrisonerFactory {
    public static final String[] names = {"Piper","Lolli","Red"};

    public static AbstractPrisoner getPrisoner(String name){
        for(int i = 0; i< names.length;i++){
           if(names[i].equalsIgnoreCase(name)){
               return new Prisoner(name);
           }
        }return new NullPrisoner();
    }
}
