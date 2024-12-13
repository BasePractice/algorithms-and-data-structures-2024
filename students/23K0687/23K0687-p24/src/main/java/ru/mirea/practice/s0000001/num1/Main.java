package ru.mirea.practice.s0000001.num1;

public final class Main {
    private Main() {
        throw new UnsupportedOperationException("Этот класс не предназначен для создания экземпляров");
    }

    public static void main(String[] args) {
        ICreateDocument factory = new CreateTextDocument();
        EditorFrame editorFrame = new EditorFrame(factory);
        editorFrame.setVisible(true);
    }
}
