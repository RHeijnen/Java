package AdapterPatterns.Sample17;

/**
 * Created by Indi on 6/24/2016.
 */
public class AudioPlayer implements MediaPlayer {
    MediaPlayer mp;

    @Override
    public void play(String audioType, String filename) {
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing retro player file : "+filename);
        }else if(audioType.equalsIgnoreCase("mp4")||audioType.equalsIgnoreCase("mp5")){
            mp = new MediaAdapter(audioType);
            mp.play(audioType,filename);
        } else{
            System.out.println("Unknown file type "+audioType);
        }
    }
}
