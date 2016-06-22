package AdapterPatterns.Sample1;

/**
 * Created by Indi on 6/22/2016.
 */
public class PlaystationEmulator implements AdvancedEmulator {
    @Override
    public void playN64(String gameName) {

    }

    @Override
    public void playPS1(String gameName) {
        System.out.println("Starting up game: "+gameName);
    }
}
