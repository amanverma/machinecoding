package designPatterns.CommandPattern;

public class RadioOnCommand implements Command{
    Radio radio;
    RadioOnCommand(Radio radio){
        this.radio = radio;
    }
    @Override
    public void execute() {
        radio.radioOn();

    }
}
