package ru.mirea.practice.s0000001.num1;

public class CreateTextDocument implements ICreateDocument {
    public IDocument createNew() {
        return new TextDocument();
    }

    public IDocument createOpen() {
        return new TextDocument();
    }
}
