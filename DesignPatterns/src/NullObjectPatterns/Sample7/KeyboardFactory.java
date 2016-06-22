package NullObjectPatterns.Sample7;

/**
 * Created by Indi on 6/22/2016.
 */
public class KeyboardFactory {
    public static String[] names = {"Razer","Logitech","SteelSeries","BTO"};

    public static AbstractKeyboard getKeyboardType(String name){
        for(int i = 0; i<names.length;i++){
            if(names[i].equalsIgnoreCase(name)){
                return new Keyboard(name);
            }
        }
        return new NullKeyboard();
    }
}
