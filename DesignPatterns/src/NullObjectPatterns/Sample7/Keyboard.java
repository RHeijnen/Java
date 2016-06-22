package NullObjectPatterns.Sample7;

/**
 * Created by Indi on 6/22/2016.
 */
public class Keyboard extends AbstractKeyboard {
    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }

    public Keyboard(String name){
        this.name = name;
    }
}
