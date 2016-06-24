package NullObjectPatterns.Sample17;

/**
 * Created by Indi on 6/23/2016.
 */
public class ActorFactory  {

    String[] actors = {"Bob","John"};
    public AbstractActor actor(String name){
        for(int i = 0; i < actors.length;i++){
            if(actors[i].equalsIgnoreCase(name)){
                return new Actor(name);
            }
        }
        return new NullActor();
    }
}
