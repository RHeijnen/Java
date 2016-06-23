package AdapterPatterns.Sample3;

/**
 * Created by Indi on 6/23/2016.
 */
public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String filename){
        if(filename.equalsIgnoreCase("mp4")){
            advancedMediaPlayer = new MP4Player();
        }else if(filename.equalsIgnoreCase("mkv")){
            advancedMediaPlayer = new MKVPlayer();
        }
    }


    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mkv")){
            advancedMediaPlayer.playMKV(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer.playMP4(fileName);
        }
    }
}
