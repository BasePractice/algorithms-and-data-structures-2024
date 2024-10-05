package ru.mirea.practice.s23L0908.Task3;
public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Nothing was given, file path expected.");
            System.exit(0);
        }
        App app = new App(args[0]);
        app.run();
    }
}
