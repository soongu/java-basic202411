package chap1_10.practice.q6;

public class MediaPlayer {

    private MediaPlayable[] mediaList;

    public MediaPlayer() {
        this.mediaList = new MediaPlayable[0];
    }

    public void addMedia(MediaPlayable media) {
        MediaPlayable[] temp = new MediaPlayable[mediaList.length + 1];
        for (int i = 0; i < mediaList.length; i++) {
            temp[i] = mediaList[i];
        }
        temp[temp.length - 1] = media;
        mediaList = temp;
    }

    public void playAll() {
        for (MediaPlayable media : mediaList) {
            media.play();
        }
    }
}
