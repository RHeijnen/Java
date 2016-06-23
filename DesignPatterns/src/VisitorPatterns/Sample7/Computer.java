package VisitorPatterns.Sample7;

/**
 * Created by Indi on 6/23/2016.
 */
public class Computer implements ComputerType {
    ComputerType[] computerTypes;

    public Computer(){
    computerTypes = new ComputerType[]{new Monitor()};
    }

    @Override
    public void accept(ComputerVisitor computerVisitor) {
        for(int i = 0; i < computerTypes.length;i++){
            computerTypes[i].accept(computerVisitor);
        }
        computerVisitor.visit(this);
    }
}
