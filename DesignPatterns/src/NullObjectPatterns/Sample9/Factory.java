package NullObjectPatterns.Sample9;

/**
 * Created by Indi on 6/22/2016.
 */
public class Factory {
    public String[] validtypes = {"XML","CSV"};
    public AbstractParser getType(String name){
        for(int i = 0; i < validtypes.length;i++){
            if(validtypes[i].equalsIgnoreCase(name)){
                return new Parser(name);
            }
        }
        return new NullParser();
    }

}
