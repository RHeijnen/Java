package NullObjectPatterns.Sample9;

/**
 * Created by Indi on 6/22/2016.
 */
public class Parser extends AbstractParser {
    public Parser(String type){
        this.type = type;
    }

    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public String getType() {
        return type;
    }
}
