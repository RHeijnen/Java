package IteratorPatterns.Sample3;

public class Main {

    public static void main(String[] args) {

        Base data = new Base();
        for(Iterator iterate = data.getIterator();iterate.hasnext();){
            String content = (String) iterate.Next();
            System.out.println(content);
        }


    }
}
