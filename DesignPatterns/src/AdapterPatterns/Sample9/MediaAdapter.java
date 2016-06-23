package AdapterPatterns.Sample9;

/**
 * Created by Indi on 6/23/2016.
 */
public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer amp;
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mkv")){
            amp.playMKV(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")){
            amp.playMP4(fileName);
        }
    }
    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("mkv")){
            amp = new MKVPlayer();
        }else if(audioType.equalsIgnoreCase("mp4")){
            amp = new MP4Player();
        }
    }
}
