package NullObjectPatterns.Sample8;

/**
 * Created by Indi on 6/22/2016.
 */
public class SpaceShip extends AbstractSpaceShip {
    public SpaceShip(String name){
        this.name = name;
    }
    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }

}
