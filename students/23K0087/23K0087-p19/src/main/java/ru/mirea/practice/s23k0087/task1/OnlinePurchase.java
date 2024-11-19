package ru.mirea.practice.s23k0087.task1;

import java.util.Scanner;

public final class OnlinePurchase {

    private OnlinePurchase() {

    }

    public static void validateInn(String inn) throws InvalidInnException {
        if (inn.length() != 12 || !inn.matches("\\d+")) {
            throw new InvalidInnException(inn);
        }
    }

    public static void processOrder(String clientName, String inn) {
        try {
            validateInn(inn);
            System.out.println("Заказ успешно оформлен для " + clientName);
        } catch (InvalidInnException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Введите ФИО: ");
            String clientName = scanner.nextLine();

            System.out.print("Введите номер ИНН: ");
            String inn = scanner.nextLine();

            processOrder(clientName, inn);
        }
    }
}

