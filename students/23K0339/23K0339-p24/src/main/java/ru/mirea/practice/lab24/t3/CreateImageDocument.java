package ru.mirea.practice.lab24.t3;

public class CreateImageDocument implements ICreateDocument {

    @Override
    public IDocument createNew() {
        return new ImageDocument();
    }

    @Override
    public IDocument createOpen() {
        // Реализуем логику открытия существующего документа изображения
        System.out.println("Открытие документа изображения...");
        return new ImageDocument();
    }
}

