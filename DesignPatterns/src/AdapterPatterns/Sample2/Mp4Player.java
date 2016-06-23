package AdapterPatterns.Sample2;

/**
 * Created by Indi on 6/23/2016.
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVLC(String filename) {
    //
    }

    @Override
    public void playMP4(String filename) {
        System.out.println("Playing .mp4 : " + filename );
    }
}
