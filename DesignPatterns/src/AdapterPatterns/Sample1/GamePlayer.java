package AdapterPatterns.Sample1;

/**
 * Created by Indi on 6/22/2016.
 */
public class GamePlayer implements Emulator {
    Emulator emulator;
    @Override
    public void play(String gameName, String romType) {

        if(romType.equalsIgnoreCase("snes")){
            System.out.println("Starting up SNES EMULATOR with " + gameName);
        }
        else if (romType.equalsIgnoreCase("PS1")|| romType.equalsIgnoreCase("N64")){
            emulator = new EmulatorAdaptor(romType);
            emulator.play(gameName,romType);
        }
        else{
            System.out.println("Console Type not yet implemented");
        }
    }
}
