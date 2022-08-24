package designPatterns.CommandPattern;
//only single button
public class RemoteControl {
    Command button;
    public void setCommand(Command command){
        this.button = command;
    }
    public void pressButton(){
        button.execute();
    }

}
