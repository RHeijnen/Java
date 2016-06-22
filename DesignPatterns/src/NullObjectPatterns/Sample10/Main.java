package NullObjectPatterns.Sample10;

public class Main {

    public static void main(String[] args) {

        SummonerFactory SF = new SummonerFactory();
        AbstractLeagueSummoner summoner1 = SF.summoner("Tiger Woods");
        System.out.println(summoner1.getName());

        AbstractLeagueSummoner summoner2 = SF.summoner("Eziekil");
        System.out.println(summoner2.getName());


    }
}
