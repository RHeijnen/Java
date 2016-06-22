package IteratorPatterns.Sample2;

public class Main {

    public static void main(String[] args) {
        DataSet ref_dataSet = new DataSet();
        for(Iterator iterate = ref_dataSet.getIterator();iterate.hasNext();){
            String content = (String) iterate.Next();
            System.out.println(content);
        }
    }
}
