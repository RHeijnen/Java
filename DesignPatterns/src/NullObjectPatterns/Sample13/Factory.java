package NullObjectPatterns.Sample13;

/**
 * Created by Indi on 6/23/2016.
 */
public class Factory {
     String[] names = {"Ironman","Captain America","Spiderman"};

    public  AbstractHero getHero(String name){
        for(int i = 0; i < names.length;i++){
            if(names[i].equalsIgnoreCase(name)){
                return new Hero(name);
            }
        }
        return new NullHero();
    }
}
