package designPatterns.CommandPattern;

public class Radio {
    int volumeLevel;

    public void radioOn(){
        System.out.println(" Radio has been turned On...");
    }
    public void radioOff(){
        System.out.println("Radio has been turned Off...");
    }
    public void setVolumeLevel(int volumeLevel){
        System.out.println("Radio volume has been set to "+ volumeLevel);
    }

}
