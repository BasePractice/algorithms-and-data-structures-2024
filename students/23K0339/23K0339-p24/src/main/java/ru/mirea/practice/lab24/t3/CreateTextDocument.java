package ru.mirea.practice.lab24.t3;

public class CreateTextDocument implements ICreateDocument {

    @Override
    public IDocument createNew() {
        return new TextDocument();
    }

    @Override
    public IDocument createOpen() {
        // Реализуем логику открытия существующего текстового документа
        System.out.println("Открытие текстового документа...");
        return new TextDocument();
    }
}
