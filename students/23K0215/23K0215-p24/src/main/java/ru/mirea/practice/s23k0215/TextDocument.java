package ru.mirea.practice.s23k0215;



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
