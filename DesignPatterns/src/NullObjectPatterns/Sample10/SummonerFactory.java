package NullObjectPatterns.Sample10;

/**
 * Created by Indi on 6/22/2016.
 */
public class SummonerFactory {

    public static String[] names = {"Tiger Woods","Master Niek","SmileBomb"};

    public AbstractLeagueSummoner summoner(String name) {


        for (int i = 0; i < names.length; i++) {
            if(names[i].equalsIgnoreCase(name)){
                return new LeagueSummoner(name);
            }

        }return new NullLeagueSummoner();
    }
}
