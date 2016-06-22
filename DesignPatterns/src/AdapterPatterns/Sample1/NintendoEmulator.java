package AdapterPatterns.Sample1;

/**
 * Created by Indi on 6/22/2016.
 */
public class NintendoEmulator implements AdvancedEmulator {
    @Override
    public void playN64(String gameName) {
        System.out.println("Starting up: "+gameName);
    }

    @Override
    public void playPS1(String gameName) {
        //
    }
}
