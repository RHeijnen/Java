package NullObjectPatterns.Sample5;

/**
 * Created by Indi on 6/22/2016.
 */
public class ActorFactory {
    public static String[] names = {"Johny Depp","Brad Pitt","That one guy from that one time"};

    public static AbstractActor Actor(String name){
        for(int i =0; i< names.length;i++){
            if (names[i].equalsIgnoreCase(name)){
                return new Actor(name);
            }
        }return new NullActor();
    }
}
