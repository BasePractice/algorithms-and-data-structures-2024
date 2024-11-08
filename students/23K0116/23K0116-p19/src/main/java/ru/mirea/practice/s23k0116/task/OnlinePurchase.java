package ru.mirea.practice.s23k0116.task;

import java.util.Scanner;

public abstract class OnlinePurchase {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите ФИО:");
            String fullName = scanner.nextLine();

            System.out.println("Введите ИНН:");
            String inn = scanner.nextLine();

            Customer customer = new Customer(fullName, inn);
            customer.validateInn(); // Проверка ИНН

            System.out.println("Покупка завершена для клиента: " + customer.getFullName());

        } catch (InvalidinnException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}
