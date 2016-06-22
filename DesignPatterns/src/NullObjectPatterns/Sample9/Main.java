package NullObjectPatterns.Sample9;

public class Main {

    public static void main(String[] args) {

        Factory fact = new Factory();
        AbstractParser parser1 = fact.getType("XML");
        AbstractParser parser2 = fact.getType("CSV");
        System.out.println(parser1.getType());

        System.out.println(parser2.getType());
        AbstractParser parser3 = fact.getType("PHP");
        System.out.println(parser3.getType());
    }
}
