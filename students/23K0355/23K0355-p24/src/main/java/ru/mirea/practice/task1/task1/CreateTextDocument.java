package ru.mirea.practice.task1.task1;

public class CreateTextDocument implements ICreateDocument {
    @Override
    public IDocument createNew() {
        System.out.println("Создание нового текстового документа...");
        return new TextDocument();
    }

    @Override
    public IDocument createOpen() {
        System.out.println("Открытие существующего текстового документа...");
        return new TextDocument();
    }
}
