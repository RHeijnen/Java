package NullObjectPatterns.Sample4;

/**
 * Created by Indi on 6/22/2016.
 */
public class PersonFactory {
    public static String[] names = {"Hello","My","Name","is","Shady"};

    public static AbstractPerson Person(String name){
        for(int i=0;i<names.length;i++){
            if(names[i].equalsIgnoreCase(name)){
                return new Person(name);
            }
        }return new Nullperson();
    }
}
