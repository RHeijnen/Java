package AdapterPatterns.Sample19;

/**
 * Created by Indi on 6/24/2016.
 */
public class MP4Player implements AdvancedMediaPlayer {
    @Override
    public void playMP3(String fileName) {

    }

    @Override
    public void playMP4(String fileName) {
        System.out.println("Playing mp4 file "+fileName);
    }
}
