package AdapterPatterns.Sample17;

/**
 * Created by Indi on 6/24/2016.
 */
public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer amp;

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("mp4")){
            amp = new MP4Player();
        } else if(audioType.equalsIgnoreCase("mp5")){
            amp = new MP5Player();
        }
    }
    @Override
    public void play(String audioType, String filename) {
        if(audioType.equalsIgnoreCase("mp4")){
            amp.playMP4(filename);
        } else if(audioType.equalsIgnoreCase("mp5")){
            amp.playMP5(filename);
        }
    }
}
