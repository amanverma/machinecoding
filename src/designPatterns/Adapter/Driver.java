package designPatterns.Adapter;

public class Driver {
    public static void main(String[] args){
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3","Dil Le Gai Kudi Gujarat ki..");
        audioPlayer.play("mp4","Ek pal ka Jeena..");
        audioPlayer.play("wav","Ude jab jab zulfe teri..");
        audioPlayer.play("vlc","Janam dekhlo mit gai duria..");
    }
}
