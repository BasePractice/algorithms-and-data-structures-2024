package ru.mirea.practice.s23k0120.task1;

public abstract class Main {
    public static void main(String[] args) {
        GuessGameFrame game = new GuessGameFrame(0, 20, 3);
        game.setVisible(true);
    }
}
