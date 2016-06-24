package AdapterPatterns.Sample16;

/**
 * Created by Indi on 6/23/2016.
 */
public class MP5Player implements AdvancedMediaPlayer {
    @Override
    public void PlayMP4(String fileName) {

    }

    @Override
    public void PlayMP5(String fileName) {
        System.out.println("Playing MP5 File "+fileName);
    }
}
