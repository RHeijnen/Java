package IteratorPatterns.Sample1;

/**
 * Created by Indi on 6/22/2016.
 */
public class DataSet implements Container {
    String[] Names = {"1","2","3"};
    @Override
    public Iterator getIterator() {
        return new namesIterator();
    }

    private class namesIterator implements Iterator {
        public int counter;

        @Override
        public boolean hasNext() {
            if(counter<Names.length){
                return true;
            }return false;
        }

        @Override
        public Object Next() {
            if (hasNext()){
                return Names[counter++];
            }return null;
        }
    }
}
