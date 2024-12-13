package ru.mirea.practice.s0000001.num1;

public class TextDocument implements IDocument {
    public void open() {
        System.out.println("Открыт текстовый документ");
    }

    public void save() {
        System.out.println("Текстовый документ сохранен");
    }
}
