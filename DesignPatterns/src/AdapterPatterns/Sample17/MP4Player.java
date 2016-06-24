package AdapterPatterns.Sample17;

/**
 * Created by Indi on 6/24/2016.
 */
public class MP4Player implements AdvancedMediaPlayer {
    @Override
    public void playMP4(String filename) {
        System.out.println("Playing mp4 file "+filename);
    }

    @Override
    public void playMP5(String filename) {

    }
}
