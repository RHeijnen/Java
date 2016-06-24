package AdapterPatterns.Sample20;

/**
 * Created by Indi on 6/24/2016.
 */
public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer amp;
    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("mp5")){
            amp = new MP5Player();
        }else if(audioType.equalsIgnoreCase("mp4")){
            amp = new MP4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp5")){
            amp.playMP5(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")){
            amp.playMP4(fileName);
        }
    }
}
