package AdapterPatterns.Sample19;

/**
 * Created by Indi on 6/24/2016.
 */
public class MP3Player implements AdvancedMediaPlayer {
    @Override
    public void playMP3(String fileName) {
        System.out.println("Playing mp3 file "+fileName);
    }

    @Override
    public void playMP4(String fileName) {

    }
}
