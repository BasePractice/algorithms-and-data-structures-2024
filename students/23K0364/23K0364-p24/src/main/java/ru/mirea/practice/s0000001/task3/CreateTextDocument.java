package ru.mirea.practice.s0000001.task3;

public class CreateTextDocument implements ICreateDocument {
    @Override
    public IDocument createNew() {
        System.out.println("Creating new TextDocument.");
        return new TextDocument();
    }

    @Override
    public IDocument createOpen() {
        System.out.println("Opening existing TextDocument.");
        return new TextDocument();
    }
}
