package IteratorPatterns.Sample11;

/**
 * Created by Indi on 6/24/2016.
 */
public class DataSet implements Container {
    String[] names = {"Bob","Henk","Jenny"};

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
        public Object getName() {
            if(hasNext()){
                return names[counter++];
            }return null;
        }
    }
}
