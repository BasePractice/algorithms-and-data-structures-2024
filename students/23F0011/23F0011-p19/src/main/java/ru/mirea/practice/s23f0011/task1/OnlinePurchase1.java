package ru.mirea.practice.s23f0011.task1;

import java.util.Scanner;

public abstract class OnlinePurchase1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Введите ФИО: ");
            String fio = scanner.nextLine();
            System.out.println(fio);
            System.out.print("Введите ИНН: ");
            String inn = scanner.nextLine();

            try {
                validateInn(inn);
                System.out.println("Заказ оформлен успешно!");
            } catch (InvalidInnexception e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
    }

    public static void validateInn(String inn) throws InvalidInnexception {
        // Проверка длины ИНН
        if (inn.length() != 12) {
            throw new InvalidInnexception("Некорректная длина ИНН.");
        }
    }
}
