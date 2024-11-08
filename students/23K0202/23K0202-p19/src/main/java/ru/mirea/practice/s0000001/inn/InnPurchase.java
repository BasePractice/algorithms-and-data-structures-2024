package ru.mirea.practice.s0000001.inn;


import java.util.Scanner;

public final class InnPurchase {
    private InnPurchase() {

    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Пожалуйста, введите ваше полное имя: ");
            String name = input.nextLine();

            System.out.print("Введите ваш ИНН: ");
            String taxId = input.nextLine();

            try {
                checkInn(taxId);
                System.out.println("Ваш заказ успешно оформлен для " + name + " с ИНН: " + taxId);
            } catch (InvalidInnException e) {
                System.out.println("Произошла ошибка: " + e.getMessage());
            } finally {
                input.close();
            }
        }

    }

    private static void checkInn(String taxId) throws InvalidInnException {
        if (taxId == null || taxId.trim().isEmpty()) {
            throw new InvalidInnException("ИНН не может быть пустым.");
        }

        if (!taxId.matches("\\d{10}") && !taxId.matches("\\d{12}")) {
            throw new InvalidInnException("Недействительный ИНН. Он должен содержать 10 или 12 цифр.");
        }
    }
}
