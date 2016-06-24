package VisitorPatterns.Sample16;

/**
 * Created by Indi on 6/24/2016.
 */
public class Frank implements PersonType {
    @Override
    public void accept(PersonVisitor personVisitor) {
        personVisitor.visit(this);
    }
}
