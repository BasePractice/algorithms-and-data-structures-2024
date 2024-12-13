package ru.mirea.practice.s23l0908.task2;

public final class Main {

    private Main() {
    }

    public static void main(String[] args) {
        System.out.println("\"abcdefghijklmnopqrstuv18340\": "
            + "abcdefghijklmnopqrstuv18340".matches("^abcdefghijklmnopqrstuv18340$"));
        System.out.println("\"abcdefghijklmnoasdfasdpqrstuv18340\": "
            + "abcdefghijklmnoasdfasdpqrstuv18340".matches("^abcdefghijklmnopqrstuv18340$"));
    }
}
