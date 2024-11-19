package ru.mirea.practice.s0000001.n1;

import java.util.Scanner;

public final class Main {

    private Main() {
        throw new UnsupportedOperationException("Utility class");
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Введите ИНН: ");
            String inn = input.nextLine();

            try {
                checkInn(inn);
                System.out.println("ИНН действителен!");
            } catch (InvalidInnException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    static void checkInn(String inn) throws InvalidInnException {
        if (inn == null || inn.length() != 12 || !inn.matches("\\d+")) {
            throw new InvalidInnException("Недействительный ИНН: " + inn);
        }
    }
}
