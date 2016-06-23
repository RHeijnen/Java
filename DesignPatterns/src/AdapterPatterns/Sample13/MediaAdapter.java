package AdapterPatterns.Sample13;

/**
 * Created by Indi on 6/23/2016.
 */
public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer amp;

    public MediaAdapter(String name){
        if(name.equalsIgnoreCase("mkv")){
            amp = new MKVPlayer();
        }else if(name.equalsIgnoreCase("mp4")){
            amp = new MP4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mkv")){
            amp.playMKV(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")){
            amp.playMP4(fileName);
        }
    }
}
