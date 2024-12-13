package ru.mirea.practice.task1.task1;

public class TextDocument implements IDocument {
    @Override
    public void open() {
        System.out.println("Открытие текстового документа...");
    }

    @Override
    public void save() {
        System.out.println("Сохранение текстового документа...");
    }

    @Override
    public void close() {
        System.out.println("Закрытие текстового документа...");
    }
}
