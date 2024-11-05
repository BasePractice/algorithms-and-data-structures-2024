package ru.mirea.practice.s0000001;

import java.util.Scanner;


abstract class First {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Введите ФИО: ");
            String fullName = scanner.nextLine();

            System.out.print("Введите номер ИНН: ");
            String inn = scanner.nextLine();

            try {
                validateInn(inn);
                System.out.println("Заказ оформлен для " + fullName);
            } catch (InvalidInnException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
    }

    private static void validateInn(String inn) throws InvalidInnException {
        // длина 10 или 12
        if (inn.length() != 10 && inn.length() != 12) {
            throw new InvalidInnException("ИНН должен содержать 10 или 12 цифр.");
        }

        // цифры
        if (!inn.matches("\\d+")) {
            throw new InvalidInnException("ИНН должен содержать только цифры.");
        }


    }
}
