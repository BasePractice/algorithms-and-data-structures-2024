package ru.mirea.practice.s0000001.task3;

public abstract class Main {
    public static void main(String[] args) {
        ICreateDocument factory = new CreateTextDocument();
        Application app = new Application(factory);
        app.run();
    }
}
