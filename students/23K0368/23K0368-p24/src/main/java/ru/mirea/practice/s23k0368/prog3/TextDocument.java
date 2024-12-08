package ru.mirea.practice.s23k0368.prog3;

public class TextDocument implements IDocument {
    @Override
    public void open() {
        System.out.println("Открываем текстовый документ.");
    }

    @Override
    public void save() {
        System.out.println("Сохраняем текстовый документ.");
    }

    @Override
    public void close() {
        System.out.println("Закрываем текстовый документ.");
    }
}
