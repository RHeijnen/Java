package AdapterPatterns.Sample18;

/**
 * Created by Indi on 6/24/2016.
 */
public class MP4Player implements AdvancedMediaPlayer {
    @Override
    public void playMKV(String fileName) {

    }

    @Override
    public void playMP4(String fileName) {
        System.out.println("Playing mp4 file "+fileName);
    }
}
