package ru.mirea.practice.s0000001.task1;

class CreateTextDocument implements ICreateDocument {
    @Override
    public IDocument createNew() {
        System.out.println("Создан новый текстовый документ");
        return new TextDocument();
    }

    @Override
    public IDocument createOpen() {
        System.out.println("Открыт существующий текстовый документ");
        return new TextDocument();
    }
}
