import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MediaPlayer {

    private List<Playable> listOfTracks;

    public MediaPlayer() {
        this.listOfTracks = new ArrayList<>();
    }

    public List<Playable> getListOfTracks() {
        return listOfTracks;
    }

    public void setListOfTracks(List<Playable> listOfTracks) {
        this.listOfTracks = listOfTracks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MediaPlayer that = (MediaPlayer) o;
        return Objects.equals(listOfTracks, that.listOfTracks);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(listOfTracks);
    }

    public void audioOrVideo(Playable... tracks) {
        for (Playable track : tracks) {
            listOfTracks.add(track);


        }

    }

    public void playAllAudioAndVideo() {
        for (Playable listOfTrack : listOfTracks) {
            listOfTrack.printInfo();
            listOfTrack.play();


        }
    }


}


//1. Создайте интерфейс Playable. С двумя методами:
//1.1 метод void play()
//1.2 default-метод printInfo(), реализация которого сообщает, что мы имеем дело с запускаемым файлом
//
//2. Реализуйте интерфейс Playable в двух классах:
//2.1 AudioTrack
//2.2 Video
//
//3. Создайте класс MediaPlayer. В нем добавьте возможность добавить трек или видео в список прослушивания.
//Используя varargs, добавьте возможномть добавлять несколько треков за раз.
//Также добавьте метод для запуска "очереди треков". Перед запуском каждого трека выводите информацию о каждом треке