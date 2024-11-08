package ru.mirea.practice.s0000001.task1;

import java.util.Scanner;

public abstract class OnlinePurchase {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите ФИО: ");
            String fullName = scanner.nextLine();

            System.out.print("Введите номер ИНН: ");
            String inn = scanner.nextLine();

            validateInn(inn);
            System.out.println("Заказ оформлен успешно для " + fullName);
        } catch (InvalidInnException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static void validateInn(String inn) throws InvalidInnException {
        if (inn.length() != 10 && inn.length() != 12) {
            throw new InvalidInnException("Недействительный ИНН: должен содержать 10 или 12 цифр.");
        }

        for (char ch : inn.toCharArray()) {
            if (!Character.isDigit(ch)) {
                throw new InvalidInnException("Недействительный ИНН: должен содержать только цифры.");
            }
        }


    }
}
