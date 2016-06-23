package AdapterPatterns.Sample9;

public class Main {

    public static void main(String[] args) {

            AudioPlayer ap = new AudioPlayer();
        ap.play("wav","hello");
        ap.play("mp3","hello");
        ap.play("mkv","hello");



    }
}
