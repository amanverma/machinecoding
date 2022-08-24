package designPatterns.Memento.src;

public class TextEditor {
    private TextWindow textWindow;
    public TextEditor(TextWindow textWindow){
        this.textWindow = textWindow;
    }

    public void write(String text){
        textWindow.append(text);
    }
    public String print(){
        return textWindow.getCurrentText();
    }



    //As the Caretaker, it will hold the state of the Originator and ask to restore it when needed:
    private TextWindowState savedTextWindow; //Currently only Single State in Example
    //In real scenario this would be mementoList[]: List<MementoObject>
    public void hitSave(){
        savedTextWindow = textWindow.save();
    }
    public void hitUndo(){
        textWindow.restore(savedTextWindow);
    }

}
