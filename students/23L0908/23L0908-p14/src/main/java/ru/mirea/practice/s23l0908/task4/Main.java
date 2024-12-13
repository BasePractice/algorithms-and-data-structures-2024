package ru.mirea.practice.s23l0908.task4;


public final class Main {

    private Main() {
    }

    public static void main(String[] args) {
        String regex = "(.*\\++.*)";
        System.out.println("(1 + 8) – 9 / 4: " + "(1 + 8) – 9 / 4".matches(regex));
        System.out.println("6 / 5 – 2 * 9: " + "(6 / 5 – 2 * 9".matches(regex));

    }
}
