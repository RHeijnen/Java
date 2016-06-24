package AdapterPatterns.Sample22;

/**
 * Created by Indi on 6/24/2016.
 */
public class MP5Player implements AdvancedMediaPlayer {
    @Override
    public void PlayMP4(String fileName) {

    }

    @Override
    public void PlayMP5(String fileName) {
        System.out.println("Playing mp5 file "+fileName);
    }
}
