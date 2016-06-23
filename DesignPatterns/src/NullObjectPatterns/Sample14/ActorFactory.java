package NullObjectPatterns.Sample14;

/**
 * Created by Indi on 6/23/2016.
 */
public class ActorFactory  {
    String[] names = {"Mark","Bob","Danny"};

    public AbstractActor actor(String name) {
        for (int i = 0; i < names.length; i++) {
            if(names[i].equalsIgnoreCase(name)){
                return new Actor(name);
            }

        }return new NullActor();
    }
}
