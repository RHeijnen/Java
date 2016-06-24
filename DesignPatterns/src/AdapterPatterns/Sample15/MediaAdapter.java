package AdapterPatterns.Sample15;

/**
 * Created by Indi on 6/23/2016.
 */
public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer amp;

    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("mp4")){
            amp = new MP4Player();
        }else if(audioType.equalsIgnoreCase("mp5")){
            amp = new MP5Player();
        }

    }
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp4")){
            amp.playMP4(fileName);
        }else if(audioType.equalsIgnoreCase("mp5")){
            amp.playMP5(fileName);
        }

    }
}
