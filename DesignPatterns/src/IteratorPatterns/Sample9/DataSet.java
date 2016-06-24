package IteratorPatterns.Sample9;

/**
 * Created by Indi on 6/24/2016.
 */
public class DataSet implements Container {
    String[] names = {"bob","John","Hello"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator {
        int counter;

        @Override
        public boolean hasNext() {
            if( counter < names.length){
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
