package ru.mirea.practice.lab24.t3;

public class ImageDocument implements IDocument {

    @Override
    public void open() {
        System.out.println("Открыт документ изображения.");
    }

    @Override
    public void save() {
        System.out.println("Документ изображения сохранён.");
    }

    @Override
    public void close() {
        System.out.println("Документ изображения закрыт.");
    }
}

