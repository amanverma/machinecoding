package designPatterns.Adapter;

public class Mp4Player implements  AdvancedMediaPlayerInterface{
    @Override
    public void playMp4(String file) {
        System.out.println("Playing mp4 format  "+ file);
    }

    @Override
    public void playWav(String file) {
        //do nothing
    }
}
