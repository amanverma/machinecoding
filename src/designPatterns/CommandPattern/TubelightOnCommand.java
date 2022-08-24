package designPatterns.CommandPattern;

public class TubelightOnCommand implements Command {
    private Tubelight tubelight;
    TubelightOnCommand(Tubelight tubelight){
        this.tubelight = tubelight;
    }

    @Override
    public void execute() {
        tubelight.lightsOn();

    }
}
