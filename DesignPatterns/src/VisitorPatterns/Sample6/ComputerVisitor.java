package VisitorPatterns.Sample6;

/**
 * Created by Indi on 6/23/2016.
 */
public interface ComputerVisitor {
    void visit(Monitor monitor);
    void visit(Computer computer);
}
