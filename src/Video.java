import java.util.Objects;

public class Video implements Playable {

    private String track;

    public Video(String track) {
        this.track = track;
    }

    @Override
    public String toString() {
        return "Video{" +
                "track='" + track + '\'' +
                '}';
    }

    public String getTrack() {
        return track;
    }

    public void setTrack(String track) {
        this.track = track;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Video video = (Video) o;
        return Objects.equals(track, video.track);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(track);
    }

    @Override
    public void play() {
        System.out.println("Проигрывается видео: " + track);

    }

    @Override
    public void printInfo() {
//        System.out.println("Видеотрек: " + track);
        Playable.super.printInfo();
    }
}
