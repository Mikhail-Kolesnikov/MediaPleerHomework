import java.util.Objects;

public class AudioTrack implements Playable {

    private String track;

    public AudioTrack(String track) {
        this.track = track;
    }

    @Override
    public String toString() {
        return "AudioTrack{" +
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
        AudioTrack that = (AudioTrack) o;
        return Objects.equals(track, that.track);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(track);
    }

    @Override
    public void play() {
        System.out.println();
        System.out.println("Проигрывается аудиоотрек: " + track);

    }

    @Override
    public void printInfo() {
//        System.out.println("Аудиотрек: " + track);
        Playable.super.printInfo();
    }
}
