package AdapterPatterns.Sample7;

/**
 * Created by Indi on 6/23/2016.
 */
public class MKVPlayer implements AdvancedMediaPlayer {
    @Override
    public void playMKV(String fileName) {
        System.out.println("Playing MKV File : "+fileName);
    }

    @Override
    public void playMP4(String fileName) {

    }
}
