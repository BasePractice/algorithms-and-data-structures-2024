package ru.mirea.practice.s23k0368.prog3;

public class CreateTextDocument implements ICreateDocument {
    @Override
    public IDocument createNewDocument() {
        return new TextDocument();
    }

    @Override
    public IDocument createOpen() {
        return new TextDocument();
    }
}
