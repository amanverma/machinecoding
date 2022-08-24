package designPatterns.CommandPattern;

public class RadioVolumeCommand implements Command{
    int volumeLevel;
    Radio radio;
    public RadioVolumeCommand(Radio radio, int volumeLevel){
        this.radio = radio;
        this.volumeLevel = volumeLevel;
    }
    @Override
    public void execute() {
        radio.setVolumeLevel(volumeLevel);

    }
}
