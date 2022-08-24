package designPatterns.Adapter;

public class MediaAdapter implements  MediaPlayerInterface {
    AdvancedMediaPlayerInterface advancedMediaPlayerInterface;
    public MediaAdapter(String format){
        if(format.equals("mp4")){
            advancedMediaPlayerInterface = new Mp4Player();
        }else if(format.equals("wav")){
            advancedMediaPlayerInterface = new WavPlayer();
        }
    }
    @Override
    public void play(String format, String file) {
        if(format.equals("mp4")){
            advancedMediaPlayerInterface.playMp4(file);
        }else if(format.equals("wav")){
            advancedMediaPlayerInterface.playWav(file);
        }
    }
}
