package designPatterns.CommandPattern;

public class RadioOffCommand implements  Command{
    Radio radio;
    @Override
    public void execute() {
        radio.radioOff();
    }
}
