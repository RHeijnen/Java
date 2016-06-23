package IteratorPatterns.Sample5;

/**
 * Created by Indi on 6/23/2016.
 */
public class DataSet implements Container {
    String[] names = {"Hello","World"};
    @Override
    public Iterator getIterator() {
        return new namesIterator();
    }

    private class namesIterator implements Iterator {
        int counter;
        @Override
        public Boolean hasNext() {
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
