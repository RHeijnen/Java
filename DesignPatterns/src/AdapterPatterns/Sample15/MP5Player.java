package AdapterPatterns.Sample15;

/**
 * Created by Indi on 6/23/2016.
 */
public class MP5Player implements AdvancedMediaPlayer {
    @Override
    public void playMP4(String fileName) {

    }

    @Override
    public void playMP5(String fileName) {
        System.out.println("Playing mp5 file ."+fileName);
    }
}
