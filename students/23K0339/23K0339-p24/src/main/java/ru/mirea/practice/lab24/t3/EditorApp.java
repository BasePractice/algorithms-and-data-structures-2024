package ru.mirea.practice.lab24.t3;

public class EditorApp {
    private final ICreateDocument createDocument;
    private IDocument document;

    public EditorApp(ICreateDocument createDocument) {
        this.createDocument = createDocument;
    }

    public static void main(String[] args) {
        ICreateDocument textDocumentFactory = new CreateTextDocument();
        EditorApp app = new EditorApp(textDocumentFactory);

        app.newDocument();
        app.saveDocument();
        app.closeDocument();
        app.exit();
    }

    public void newDocument() {
        document = createDocument.createNew();
        document.open();
    }

    public void openDocument() {
        document = createDocument.createOpen();
        document.open();
    }

    public void saveDocument() {
        if (document != null) {
            document.save();
        } else {
            System.out.println("Документ не открыт.");
        }
    }

    public void closeDocument() {
        if (document != null) {
            document.close();
        } else {
            System.out.println("Документ не открыт.");
        }
    }

    public void exit() {
        System.out.println("Выход из редактора.");
    }
}
