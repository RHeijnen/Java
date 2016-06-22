package AdapterPatterns.Sample1;

/**
 * Created by Indi on 6/22/2016.
 */
public class EmulatorAdaptor implements Emulator {
    AdvancedEmulator advancedEmulator;

    public EmulatorAdaptor(String fileType){
        if(fileType.equalsIgnoreCase("N64")){
            advancedEmulator = new NintendoEmulator();
        }
        if(fileType.equalsIgnoreCase("PS1")){
            advancedEmulator = new PlaystationEmulator();
        }
    }

    @Override
    public void play(String gameName, String romType) {
        if(romType.equalsIgnoreCase("N64")){
            advancedEmulator.playN64(gameName);

        }if(romType.equalsIgnoreCase("PS1")){
            advancedEmulator.playPS1(gameName);
        }

    }
}
