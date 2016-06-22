package NullObjectPatterns.Sample2;

/**
 * Created by Indi on 6/22/2016.
 */
public class CharacterFactory {
    public static final String[] names = {"Brock Samson","The Monarch","Hank Venture","41","Her Underbite"};

    public static AbstractCharacter getCharacter(String name){
        for(int i = 0; i < names.length;i++){
            if(names[i].equalsIgnoreCase(name)){
                return new Character(name);
            }
        }
        return new NullCharacter();
    }


}
