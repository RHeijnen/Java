package AdapterPatterns.Sample17;

/**
 * Created by Indi on 6/24/2016.
 */
public class MP5Player implements AdvancedMediaPlayer {
    @Override
    public void playMP4(String filename) {

    }

    @Override
    public void playMP5(String filename) {
        System.out.println("Playing mp5 file "+filename);
    }
}
