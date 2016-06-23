package AdapterPatterns.Sample4;

/**
 * Created by Indi on 6/23/2016.
 */
public class AudioPlayer implements MediaPlayer {
    MediaPlayer amp;

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mkv")){
            System.out.println("Starting up VLC and playing MKV file : " +fileName);
        }
        if(audioType.equalsIgnoreCase("mp3") || audioType.equalsIgnoreCase("mp4")){
            amp = new MediaAdapter(audioType);
            amp.play(audioType,fileName);
        }else {
            System.out.println("unknown file type");
        }
    }
}
