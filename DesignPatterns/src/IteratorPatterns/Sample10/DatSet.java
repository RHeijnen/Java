package IteratorPatterns.Sample10;

/**
 * Created by Indi on 6/24/2016.
 */
public class DatSet implements Container {
    String[] names = {"bob","jenny","harold"};

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
