package AdapterPatterns.Sample21;

/**
 * Created by Indi on 6/24/2016.
 */
public class MP5Player implements AdvancedMediaPlayer {
    @Override
    public void playMP4(String fileName) {

    }

    @Override
    public void playMP5(String fileName) {
        System.out.println("play mp5 "+fileName);
    }
}
