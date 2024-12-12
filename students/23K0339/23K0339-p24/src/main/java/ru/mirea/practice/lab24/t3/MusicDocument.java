package ru.mirea.practice.lab24.t3;

public class MusicDocument implements IDocument {

    @Override
    public void open() {
        System.out.println("Открыт музыкальный документ.");
    }

    @Override
    public void save() {
        System.out.println("Музыкальный документ сохранён.");
    }

    @Override
    public void close() {
        System.out.println("Музыкальный документ закрыт.");
    }
}

