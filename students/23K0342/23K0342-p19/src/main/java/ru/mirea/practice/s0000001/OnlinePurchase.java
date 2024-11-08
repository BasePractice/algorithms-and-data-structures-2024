package ru.mirea.practice.s0000001;

import java.util.Scanner;

public final class OnlinePurchase {

    private OnlinePurchase() {
        throw new UnsupportedOperationException("Utility class cannot be instantiated");
    }

    public static void validateinn(String inn) throws InvalidTaxNumberException {
        if (inn.length() != 10 && inn.length() != 12) {
            throw new InvalidTaxNumberException("ИНН должен содержать 10 или 12 цифр.");
        }

        if (!inn.matches("\\d+")) {
            throw new InvalidTaxNumberException("ИНН должен содержать только цифры.");
        }

    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите ФИО: ");
            String fullName = scanner.nextLine();

            System.out.print("Введите номер ИНН: ");
            String inn = scanner.nextLine();

            try {
                validateinn(inn);
                System.out.println("Заказ успешно оформлен для " + fullName + " с ИНН " + inn);
            } catch (InvalidTaxNumberException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
    }
}
