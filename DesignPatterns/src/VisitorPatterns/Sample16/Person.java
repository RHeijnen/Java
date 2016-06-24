package VisitorPatterns.Sample16;

/**
 * Created by Indi on 6/24/2016.
 */
public class Person implements PersonType {
    PersonType[] types;
    public Person(){
        types = new PersonType[]{new Frank()};
    }

    @Override
    public void accept(PersonVisitor personVisitor) {
        for(int i = 0; i<types.length;i++){
            types[i].accept(personVisitor);
        }
        personVisitor.visit(this);
    }
}
