package ru.mirea.practice.s23l0908.Task4;

public class Main {
    public static void main(String[] args) {
        App app = new App();
        Thread animation = new Thread(app);
        animation.start();
    }
}
