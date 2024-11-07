package ru.mirea.practice.s25k0112.task5;

public final class Test {
    private Test() {

    }

    public static void main(String[] args) {
        ProcessString processString = new ProcessString();
        String string = "Hello!";

        System.out.printf("Amount of characters: %d\n", processString.countCharacters(string));
        System.out.printf("Characters on odd positions: %s\n", processString.getOddPositionCharacters(string));
        System.out.printf("Inverted string: %s\n", processString.invertString(string));

    }

}
