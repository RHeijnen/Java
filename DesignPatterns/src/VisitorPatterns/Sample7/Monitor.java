package VisitorPatterns.Sample7;

/**
 * Created by Indi on 6/23/2016.
 */
public class Monitor implements ComputerType {
    @Override
    public void accept(ComputerVisitor computerVisitor) {
        computerVisitor.visit(this);
    }
}
