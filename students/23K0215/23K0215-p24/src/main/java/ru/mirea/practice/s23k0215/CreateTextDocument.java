package ru.mirea.practice.s23k0215;



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
