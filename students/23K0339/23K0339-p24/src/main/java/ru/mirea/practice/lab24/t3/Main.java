package ru.mirea.practice.lab24.t3;

abstract class Main {
    public static void main(String[] args) {
        ICreateDocument imageDocumentFactory = new CreateImageDocument(); // Проверка использования другого типа документа
        EditorApp app = new EditorApp(imageDocumentFactory);

        app.newDocument();
        app.saveDocument();
        app.closeDocument();
        app.exit();
    }
}

