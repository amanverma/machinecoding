package designPatterns.Adapter;

public class AudioPlayer implements  MediaPlayerInterface{

    @Override
    public void play(String format, String file) {
        if(format.equals("mp3")){
            System.out.println("Playing mp3 format "+ file);
        }else{
            if(format.equals("mp4") || format.equals("wav")){
                MediaAdapter mediaAdapter = new MediaAdapter(format);
                mediaAdapter.play(format,file);
            }
            else{
                System.out.println("Format Not Supported!");
            }
        }

    }
}
