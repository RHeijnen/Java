package AdapterPatterns.Sample14;

/**
 * Created by Indi on 6/23/2016.
 */
public class AudioPlayer implements MediaPlayer {
    MediaPlayer mp;

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("wav")){
            System.out.println("Playing compatible wav file : "+fileName);
        }else if(audioType.equalsIgnoreCase("mp4")||audioType.equalsIgnoreCase("mkv")){
            mp = new MediaAdapter(audioType);
            mp.play(audioType,fileName);
        }else{
            System.out.println("no compatible file type : "+audioType );
        }
    }
}
