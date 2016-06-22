package NullObjectPatterns.Sample4;

/**
 * Created by Indi on 6/22/2016.
 */
public class Person extends AbstractPerson {

    public Person(String name){
        this.name = name;
    }
    @Override
    public boolean isNill() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
