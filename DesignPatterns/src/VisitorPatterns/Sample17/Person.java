package VisitorPatterns.Sample17;

/**
 * Created by Indi on 6/24/2016.
 */
public class Person implements PersonType {
    PersonType[] persons;

    public Person(){
        persons = new PersonType[]{new Frank()};
    }
    @Override
    public void accept(PersonVisitor personVisitor) {
        for(int i = 0; i < persons.length;i++){
            persons[i].accept(personVisitor);
        }
        personVisitor.visit(this);
    }
}
