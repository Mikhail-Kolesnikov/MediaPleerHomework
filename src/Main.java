public class Main {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer= new MediaPlayer();

        AudioTrack possible= new AudioTrack("Боже, дай мне сил!");
        AudioTrack impossible= new AudioTrack("Боже, у меня нет сил!");
        Video tryToDo=new Video("Видео, где человек старается писать код");
        Video humanTears = new Video("Видео, где человек плачет во время выполнения ДЗ " +
                "и вспоминает преподователя!");

        mediaPlayer.audioOrVideo(possible,tryToDo,humanTears);
        mediaPlayer.playAllAudioAndVideo();

        System.out.println();
    }
}
