package ru.mirea.practice.s0000001;

public final class StringSplit {
    private StringSplit() {

    }

    public static void main(String[] args) {
        String input = "very berry";

        String regex = "\\s+|[,!.?]+";
        String[] elements = input.split(regex);

        System.out.println("The split elements are:");
        for (String element : elements) {
            if (!element.isEmpty()) { // Filter out empty strings
                System.out.println(element);
            }
        }
    }
}
