package VisitorPatterns.Sample1;

/**
 * Created by Indi on 6/22/2016.
 */
public interface AnimalVisitor  {
    public void visit(Animal animal);
    public void visit(Owl owl);
    public void visit(Turtle turtle);
    public void visit(Beaver beaver);

}
