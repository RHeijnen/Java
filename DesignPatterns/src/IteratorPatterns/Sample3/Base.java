package IteratorPatterns.Sample3;

/**
 * Created by Indi on 6/22/2016.
 */
public class Base implements Container {
    public String[] names = {"Hank","The Monarch","Brock Samson"};


    @Override
    public Iterator getIterator() {
        return new nameIterator();
    }

    private class nameIterator implements Iterator {
        int counter;
        @Override
        public boolean hasnext() {
            if(counter < names.length){
                return true;
            }return false;
        }

        @Override
        public Object Next() {
            if(hasnext()){
                return names[counter++];
            }return null;
        }
    }
}
