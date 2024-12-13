package ru.mirea.practice.s23l0908.task4;

public final class Main {

    private Main() {

    }

    public static void main(String[] args) {
        App app = new App();
        Thread animation = new Thread(app);
        animation.start();
    }
}
