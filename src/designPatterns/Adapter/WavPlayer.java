package designPatterns.Adapter;

public class WavPlayer implements  AdvancedMediaPlayerInterface{
    @Override
    public void playMp4(String file) {
        //do nothing
    }

    @Override
    public void playWav(String file) {
        System.out.println("Playing  WAV format:"+ file  );
    }
}
