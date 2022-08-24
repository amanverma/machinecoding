package designPatterns.Memento.src;
//Saves current state. This is the Memento Object.
//Save and Restore /UndoFunctionality for our text
public class TextWindowState {
    private String text; //Use of string instead of SB prevents further update of the current state by outsiders.
    TextWindowState(String text){
        this.text = text;
    }
    public String getText(){
        return this.text;
    }
}
