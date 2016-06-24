package AdapterPatterns.Sample16;

/**
 * Created by Indi on 6/23/2016.
 */
public class AudioPlayer implements MediaPlayer {
     MediaPlayer mp;
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp4")||audioType.equalsIgnoreCase("mp5")){
            mp = new MediaAdapter(audioType);
            mp.play(audioType,fileName);
        }else if(audioType.equalsIgnoreCase("wav")){
            System.out.println("Playing Wav "+fileName);
        }else{
            System.out.println("unknown filetype "+audioType);
        }
    }
}
