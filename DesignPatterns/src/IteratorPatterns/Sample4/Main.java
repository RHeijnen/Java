package IteratorPatterns.Sample4;

public class Main {

    public static void main(String[] args) {

        DataSet ds = new DataSet();
        for(Iterator iterate = ds.getiterator();iterate.hasNext();){
            String content = (String) iterate.Next();
            System.out.println(content);
        }


    }
}
