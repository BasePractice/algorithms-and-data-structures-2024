package ru.mirea.practice.lab24.t3;

public class TextDocument implements IDocument {

    @Override
    public void open() {
        System.out.println("Открыт текстовый документ.");
    }

    @Override
    public void save() {
        System.out.println("Текстовый документ сохранён.");
    }

    @Override
    public void close() {
        System.out.println("Текстовый документ закрыт.");
    }
}

