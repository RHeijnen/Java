package IteratorPatterns.Sample2;

/**
 * Created by Indi on 6/22/2016.
 */
public class DataSet implements Container {
    public String[] showNames ={"12 Monkeys","Orange is the new black","Game of Thrones"};
    @Override
    public Iterator getIterator() {
        return new showIterator();
}

    private class showIterator implements Iterator {
    int counter;

        @Override
        public boolean hasNext() {
            if(counter<showNames.length){
                return true;
            }return false;
        }

        @Override
        public Object Next() {
            if(hasNext()){
                return showNames[counter++];
            }return null;
        }
    }
}
