package chap1_10.practice.q6;

public class Main {

    public static void main(String[] args) {

        MediaPlayer mediaPlayer = new MediaPlayer();

        mediaPlayer.addMedia(new AudioPlayer());
        mediaPlayer.addMedia(new VideoPlayer());
        mediaPlayer.addMedia(new ImageDisplay());

        mediaPlayer.playAll();
    }
}
