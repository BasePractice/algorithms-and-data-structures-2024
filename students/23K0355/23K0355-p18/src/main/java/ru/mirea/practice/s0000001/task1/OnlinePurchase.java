package ru.mirea.practice.s0000001.task1;

import java.util.Scanner;

public final class OnlinePurchase {

    private OnlinePurchase() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated.");
    }

    public static void checkInn(String inn) throws InvalidInnException {
        if (!inn.matches("\\d+")) {
            throw new InvalidInnException("ИНН должен состоять только из цифр.");
        }

        if (inn.length() != 10 && inn.length() != 12) {
            throw new InvalidInnException("ИНН должен содержать 10 или 12 цифр.");
        }
    }

    public static void placeOrder() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите ваше ФИО: ");
            String fullName = scanner.nextLine();

            System.out.print("Введите ваш ИНН: ");
            String inn = scanner.nextLine();

            checkInn(inn);

            System.out.println("Оформление заказа успешно. Спасибо, " + fullName + "!");
        } catch (InvalidInnException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void main(String[] args) {
        placeOrder();
    }
}
