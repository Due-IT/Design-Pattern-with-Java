package commands;

import editor.Editor;

public abstract class Command {
    public Editor editor; //커맨드가 수행되는 editor를 참조
    private String backup; //?

    Command(Editor editor) {
        this.editor = editor;
    }

    void backup() {
        backup = editor.textField.getText();
    }

    public void undo() {
        editor.textField.setText(backup);
    }

    public abstract boolean execute();
}
