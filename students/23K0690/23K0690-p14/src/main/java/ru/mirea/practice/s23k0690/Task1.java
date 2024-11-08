package ru.mirea.practice.s23k0690;

import java.util.Scanner;
import java.util.regex.Pattern;

public final class Task1 {

    private Task1() {}

    private String inputString;

    public void inputString() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите строку: ");
            this.inputString = scanner.nextLine();
        }
    }

    public String[] splitString(String regex) {
        return inputString.split(regex);
    }

    public void printElements(String[] elements) {
        System.out.println("Разделенные элементы:");
        for (String element : elements) {
            System.out.println(element);
        }
    }

    public void findMatches(String regex) {
        Pattern pattern = Pattern.compile(regex);
        String[] elements = splitString("\\s+");

        System.out.println("Найденные совпадения:");
        for (String element : elements) {
            if (pattern.matcher(element).matches()) {
                System.out.println(element);
            }
        }
    }

    public static void main(String[] args) {
        Task1 stringManipulator = new Task1();

        stringManipulator.inputString();

        String[] elements = stringManipulator.splitString("\\s+");
        stringManipulator.printElements(elements);

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите регулярное выражение для поиска совпадений: ");
            String regex = scanner.nextLine();
            stringManipulator.findMatches(regex);

        }
    }
}