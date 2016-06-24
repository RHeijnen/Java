package AdapterPatterns.Sample23;

/**
 * Created by Indi on 6/24/2016.
 */
public class AudioPlayer implements MediaPlayer {
    MediaPlayer mp;

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file "+fileName);
        }else if(audioType.equalsIgnoreCase("mp4")||audioType.equalsIgnoreCase("mp5")){
            mp = new MediaAdapter(audioType);
            mp.play(audioType,fileName);
        }else{
            System.out.println("Unknown file type "+audioType);
        }
    }
}
