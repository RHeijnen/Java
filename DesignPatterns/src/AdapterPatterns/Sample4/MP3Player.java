package AdapterPatterns.Sample4;

/**
 * Created by Indi on 6/23/2016.
 */
public class MP3Player implements AdvancedMediaPlayer {
    @Override
    public void PlayMP3(String fileName) {
        System.out.println("playing MP3 File :" +fileName);
    }

    @Override
    public void playMP4(String fileName) {

    }
}
