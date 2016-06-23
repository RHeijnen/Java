package VisitorPatterns.Sample7;

/**
 * Created by Indi on 6/23/2016.
 */
public interface ComputerVisitor {
    void visit(Computer computer);
    void visit(Monitor monitor);
}
