package designPatterns.CommandPattern;

public class Driver {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Tubelight tubelight = new Tubelight();
        Radio radio = new Radio();

        //turn on tubelight
        remoteControl.setCommand(new TubelightOnCommand(tubelight));
        remoteControl.pressButton();

        //turn on radio
        remoteControl.setCommand(new RadioOnCommand(radio));
        remoteControl.pressButton();

        //set volume level to 4 for radio
        remoteControl.setCommand(new RadioVolumeCommand(radio,4));
        remoteControl.pressButton();

        //turn off tubelight
        remoteControl.setCommand(new TubelightOffCommand(tubelight));
        remoteControl.pressButton();
    }

}
