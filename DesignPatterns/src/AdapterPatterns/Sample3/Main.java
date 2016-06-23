package AdapterPatterns.Sample3;

public class Main {

    public static void main(String[] args) {
        AudioPlayer ap = new AudioPlayer();
        ap.play("mp3","hello");
        ap.play("mkv","world");
        ap.play("xml","pointdata");



    }
}
