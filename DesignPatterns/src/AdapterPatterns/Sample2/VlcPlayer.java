package AdapterPatterns.Sample2;

/**
 * Created by Indi on 6/23/2016.
 */
public class VlcPlayer implements AdvancedMediaPlayer {


    @Override
    public void playVLC(String filename) {
        System.out.println("Player VLC file : " + filename);
    }

    @Override
    public void playMP4(String filename) {

    }
}
