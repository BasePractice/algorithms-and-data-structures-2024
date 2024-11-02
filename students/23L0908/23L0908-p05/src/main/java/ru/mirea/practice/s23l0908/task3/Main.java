package ru.mirea.practice.s23l0908.task3;

public final class Main {

    private Main() {

    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Nothing was given, file path expected.");
            System.exit(0);
        }
        App app = new App(args[0]);
        app.run();
    }
}
