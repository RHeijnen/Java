package AdapterPatterns.Sample18;

/**
 * Created by Indi on 6/24/2016.
 */
public class MKVPlayer implements AdvancedMediaPlayer {
    @Override
    public void playMKV(String fileName) {
        System.out.println("Playing mkv file "+fileName);
    }

    @Override
    public void playMP4(String fileName) {

    }
}
