package VisitorPatterns.Sample7;

/**
 * Created by Indi on 6/23/2016.
 */
public class DisplayParts implements ComputerVisitor {
    @Override
    public void visit(Computer computer) {
        System.out.println("this is the computer interface");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("this is the monitor interface");
    }
}
