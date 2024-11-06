package ru.mirea.practice.s23k0823.task1.task1.inn;

import java.util.Scanner;

public class OnlinePurchase {
    public void makePurchase() {
        try (Scanner scanner = new Scanner(System.in);) {
            System.out.print("Введите ФИО: ");
            String fio = scanner.next();
            System.out.print("Введите ИНН: ");
            String inn = scanner.next();

            try {
                if (checkInn(inn)) {
                    System.out.println("Заказ оформлен успешно на ФИО: " + fio);
                }
            } catch (InvalidInnException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
    }

    public boolean checkInn(String inn) throws InvalidInnException {
        // Определим список допустимых ИНН
        String[] validInns = {"1234567890", "9876543210", "1111111111"};

        // Проверяем, совпадает ли введенный ИНН с одним из допустимых
        for (String validInn : validInns) {
            if (inn.equals(validInn)) {
                return true;
            }
        }
        // Если ИНН не найден в списке допустимых, выбрасываем исключение
        throw new InvalidInnException("Недействительный ИНН");
    }

    public static void main(String[] args) {
        OnlinePurchase onlinePurchase = new OnlinePurchase();
        onlinePurchase.makePurchase();
    }
}
