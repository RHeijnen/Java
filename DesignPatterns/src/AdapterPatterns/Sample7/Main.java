package AdapterPatterns.Sample7;

public class Main {

    public static void main(String[] args) {

        AudioPlayer mp = new AudioPlayer();
        mp.play("mp3","hello");
        mp.play("wav","hello");
        mp.play("mkv","hello");
        mp.play("mp4","hello");


    }
}
