package IteratorPatterns.Sample6;

/**
 * Created by Indi on 6/23/2016.
 */
public class DataSet implements Container {
    String[] names = {"hi","Hello","greetings"};
    @Override
    public Iterator getIterator() {
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
