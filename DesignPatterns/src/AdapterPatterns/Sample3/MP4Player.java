package AdapterPatterns.Sample3;

/**
 * Created by Indi on 6/23/2016.
 */
public class MP4Player implements AdvancedMediaPlayer {
    @Override
    public void playMP4( String fileName) {
        System.out.println("Playing MP4 File: "+fileName);
    }

    @Override
    public void playMKV( String fileName) {

    }
}
