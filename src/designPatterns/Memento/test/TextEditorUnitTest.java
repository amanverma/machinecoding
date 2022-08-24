package designPatterns.Memento.test;

import designPatterns.Memento.src.TextEditor;
import designPatterns.Memento.src.TextWindow;

import org.junit.jupiter.api.Test;


public class TextEditorUnitTest {
    @Test
    void givenTextEditor_whenAddTextSaveAddMoreAndUndo_thenSavecStateRestored(){
        TextEditor textEditor = new TextEditor(new TextWindow());
        textEditor.write("The Memento Design Pattern\n");
        textEditor.write("How to implement it in Java?\n");
        textEditor.hitSave();

        textEditor.write("Buy milk and eggs before coming home\n");
        textEditor.hitUndo();

       // Assert.that((textEditor.print()).equalsIgnoreCase("The Memento Design Pattern\nHow to implement it in Java?\n"),"Assert Failed");
    }

}
