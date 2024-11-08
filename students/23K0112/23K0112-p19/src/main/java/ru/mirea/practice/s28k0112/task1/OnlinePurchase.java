package ru.mirea.practice.s28k0112.task1;

import java.util.Scanner;

public final class OnlinePurchase {
    private OnlinePurchase() {

    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите ФИО: ");
            String fullName = scanner.nextLine();

            System.out.print("Введите номер ИНН: ");
            String inn = scanner.nextLine();

            try {
                validateInn(inn);
                System.out.println("Заказ оформлен успешно для " + fullName + " с ИНН: " + inn);
            } catch (InvalidInnException e) {
                System.out.println("Ошибка: " + e.getMessage());
            } finally {
                scanner.close();
            }
        }
    }

    private static void validateInn(String inn) throws InvalidInnException {
        // Проверка на пустоту
        if (inn == null || inn.trim().isEmpty()) {
            throw new InvalidInnException("ИНН не может быть пустым.");
        }

        // Проверка на соответствие формату (10 или 12 цифр)
        if (!inn.matches("\\d{10}") && !inn.matches("\\d{12}")) {
            throw new InvalidInnException("Недействительный ИНН. Он должен содержать 10 или 12 цифр.");
        }
    }
}