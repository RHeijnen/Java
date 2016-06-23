package NullObjectPatterns.Sample13;

/**
 * Created by Indi on 6/23/2016.
 */
public class Hero extends AbstractHero {
    @Override
    public Boolean isNull() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }

    public Hero(String name){
        this.name = name;
    }
}
