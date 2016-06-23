package AdapterPatterns.Sample7;

/**
 * Created by Indi on 6/23/2016.
 */
public class AudioPlayer implements MediaPlayer {
    MediaPlayer mp;
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("wav")){
            System.out.println("Playing wav file : "+fileName);
        }else if(audioType.equalsIgnoreCase("mp4")|| audioType.equalsIgnoreCase("mkv")){
            mp = new MediaAdapter(audioType);
            mp.play(audioType,fileName);
        }else {
            System.out.println("Unknown filetype : "+audioType);
        }
    }
}
