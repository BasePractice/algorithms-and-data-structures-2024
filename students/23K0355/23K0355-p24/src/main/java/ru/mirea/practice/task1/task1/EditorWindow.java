package ru.mirea.practice.task1.task1;

public class EditorWindow {
    private IDocument doc;
    private ICreateDocument factory;

    public EditorWindow(ICreateDocument factory) {
        this.factory = factory;
    }

    public void newFile() {
        doc = factory.createNew();
        doc.open();
    }

    public void openFile() {
        doc = factory.createOpen();
        doc.open();
    }

    public void saveFile() {
        if (doc != null) {
            doc.save();
        } else {
            System.out.println("Нет документа для сохранения.");
        }
    }

    public void closeFile() {
        if (doc != null) {
            doc.close();
        } else {
            System.out.println("Нет документа для закрытия.");
        }
    }

    public static void main(String[] args) {
        ICreateDocument textFactory = new CreateTextDocument();
        EditorWindow editorWindow = new EditorWindow(textFactory);

        editorWindow.newFile();
        editorWindow.saveFile();
        editorWindow.closeFile();
    }
}
