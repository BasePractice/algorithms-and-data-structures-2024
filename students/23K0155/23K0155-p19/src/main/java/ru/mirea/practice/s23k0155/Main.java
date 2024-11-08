package ru.mirea.practice.s23k0155;

import java.util.Scanner;

public abstract class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Введите ФИО покупателя: ");
            String fullName = scanner.nextLine();

            System.out.println("Введите номер ИНН: ");
            String inn = scanner.nextLine();

            try {
                Client client = new Client(fullName, inn);
                System.out.println("Заказ успешно оформлен для клиента: " + client.getFullName()
                        + ", ИНН: " + client.getInn());
            } catch (InvalidInnException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
