package AdapterPatterns.Sample10;

/**
 * Created by Indi on 6/23/2016.
 */
public class AudioPlayer implements MediaPlayer {
    MediaPlayer mp;

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mkv")||audioType.equalsIgnoreCase("mp4")){
            mp = new MediaAdapter(audioType);
            mp.play(audioType,fileName);
        }else if(audioType.equalsIgnoreCase("wav")){
            System.out.println("Playing wav file : "+fileName);
        } else {
            System.out.println("Unknown file type : "+audioType);
        }
    }
}
