package IteratorPatterns.Sample10;

public class Main {

    public static void main(String[] args) {

        DatSet ds = new DatSet();
        for(Iterator iterate = ds.getIterator();iterate.hasNext();){
            String content = (String) iterate.Next();
            System.out.println(content);
        }


    }
}
