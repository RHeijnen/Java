package AdapterPatterns.Sample23;

/**
 * Created by Indi on 6/24/2016.
 */
public class MP4Player implements AdvancedMediaPlayer {
    @Override
    public void PlayMP4(String fileName) {
        System.out.println("Playing mp4 file "+fileName);
    }

    @Override
    public void PlayMP5(String fileName) {

    }
}
