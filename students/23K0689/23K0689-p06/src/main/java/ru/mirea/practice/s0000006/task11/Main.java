package ru.mirea.practice.s0000006.task11;

public final class Main {
    private Main() {

    }

    public static void main(String[] args) {
        CelsiusConverter converter = new CelsiusConverter(32.0);
        converter.printConversions();
    }
}
