package main.java.ru.mirea.practice.s0000001;

import java.util.Scanner;

public final class OnlinePurch {

    private OnlinePurch() {
        throw new UnsupportedOperationException("Этот класс не должен быть создан.");
    }

    public static void checkInn(String inn) throws InvalidInnEx {
        if (!inn.matches("\\d+")) {
            throw new InvalidInnEx("ИНН должен состоять только из цифр.");
        }

        if (inn.length() != 10 && inn.length() != 12) {
            throw new InvalidInnEx("ИНН должен содержать 10 или 12 цифр.");
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
        } catch (InvalidInnEx e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void main(String[] args) {
        placeOrder();
    }
}
