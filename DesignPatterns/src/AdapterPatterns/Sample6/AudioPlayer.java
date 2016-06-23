package AdapterPatterns.Sample6;

/**
 * Created by Indi on 6/23/2016.
 */
public class AudioPlayer implements MediaPlayer {
    MediaPlayer mp;
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("wav")){
            System.out.println("Playing WAV " +fileName);
        }else if(audioType.equalsIgnoreCase("mkv")|| audioType.equalsIgnoreCase("mp4")){
            mp = new MediaAdapter(audioType);
            mp.play(audioType,fileName);
        }else {
            System.out.println("Unknown filetype : " +audioType);
        }
    }
}
