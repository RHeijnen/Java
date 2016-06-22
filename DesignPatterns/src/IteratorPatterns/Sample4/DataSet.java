package IteratorPatterns.Sample4;

/**
 * Created by Indi on 6/22/2016.
 */
public class DataSet implements Container {
    public String[] names = {"1","2","3"};
    @Override
    public Iterator getiterator() {
        return new nameIterator();
    }

    private class nameIterator implements Iterator {
        int counter;

        @Override
        public boolean hasNext() {
            if(counter < names.length){
                return true;
            }return false;
        }

        @Override
        public Object Next() {
            if(hasNext()){
                return names[counter++];
            }return null;
        }
    }
}
