package designPatterns.Memento.src;
/*Originator can produce and consume a Memento. Meanwhile, the Caretaker only keeps the state before restoring it.
The internal representation of the Originator is kept hidden from the external world.

Here, we used a single field to represent the state of the Originator, though we're not limited
to one field and could have used as many fields as necessary. Plus, the state held in the Memento object
doesn't have to match the full state of the Originator.
As long as the kept information is sufficient to restore the state of the Originator, we're good to go.*/

public class TextWindow {
    private StringBuilder sb;
    public TextWindow(){
        this.sb = new StringBuilder();
    }
    public void append(String text){
        sb.append(text);
    }
    public String getCurrentText(){
        return sb.toString();
    }

    //create save and restore methods in this class
    //this class acts as Originator class

    //The save() method allows us to create the object,
    // while the restore() method consumes it to restore the previous state.

    public TextWindowState save(){
        return new TextWindowState(sb.toString());
    }

    public void restore(TextWindowState save){
        sb = new StringBuilder(save.getText());
    }
}
