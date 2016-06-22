package IteratorPatterns.Sample1;

public class Main {

    public static void main(String[] args) {
        DataSet data = new DataSet();
        for (Iterator iterate = data.getIterator();iterate.hasNext();){
            String content = (String) iterate.Next();
            System.out.println(content);
        }
    }
}
