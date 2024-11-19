package ru.mirea.practice.s23k0114.lab1.task1;

import java.util.Scanner;

public abstract class OnlinePurchase {
    public static void main(String[] args) {
        // Использование try-with-resources для автоматического закрытия Scanner
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите ФИО: ");
            String fullName = scanner.nextLine();

            System.out.print("Введите номер ИНН: ");
            String inn = scanner.nextLine();

            try {
                InnValidator.validateInn(inn);
                System.out.println("Заказ успешно оформлен для " + fullName + " с ИНН " + inn);
            } catch (InvalidInnException e) {
                System.err.println(e.getMessage());
            }
        } // Scanner будет автоматически закрыт здесь
    }
}
