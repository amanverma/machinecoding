package designPatterns.CommandPattern;

public class TubelightOffCommand implements  Command {
    private Tubelight tubelight;
    TubelightOffCommand(Tubelight tubelight){
        this.tubelight = tubelight;
    }
    @Override
    public void execute() {
        tubelight.lightsOff();
    }
}
