package IteratorPatterns.Sample11;

public class Main {

    public static void main(String[] args) {
    DataSet ds = new DataSet();
        for(Iterator iterate = ds.getIterator();iterate.hasNext();){
            String content = (String) iterate.getName();
            System.out.println(content);
        }



    }
}
