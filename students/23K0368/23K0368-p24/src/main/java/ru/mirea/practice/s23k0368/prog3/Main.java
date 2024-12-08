package ru.mirea.practice.s23k0368.prog3;

public abstract class Main {
    public static void main(String[] args) {

        ICreateDocument documentFactory = new CreateTextDocument();

        App app = new App(documentFactory);
        app.run();
    }
}
