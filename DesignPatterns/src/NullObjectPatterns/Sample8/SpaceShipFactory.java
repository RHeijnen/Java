package NullObjectPatterns.Sample8;

/**
 * Created by Indi on 6/22/2016.
 */
public class SpaceShipFactory {
    public static final String[] names = {"voyager","enterprise","enterprise 102"};

    public static AbstractSpaceShip getSpaceShipName(String name){
        for(int i = 0; i < names.length;i++){
            if(names[i].equalsIgnoreCase(name)){
               return new SpaceShip(name);
            }
        }return new NullSpaceShip();
    }
}
