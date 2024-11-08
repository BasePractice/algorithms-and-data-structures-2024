package ru.mirea.practice.s23k1167.task1;

class TextDocument implements IDocument {
    @Override
    public void open() {
        System.out.println("Открыт текстовый документ");
    }

    @Override
    public void save() {
        System.out.println("Текстовый документ сохранен");
    }
}
