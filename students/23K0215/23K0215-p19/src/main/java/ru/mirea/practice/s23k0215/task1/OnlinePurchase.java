package ru.mirea.practice.s23k0215.task1;


import java.util.Scanner;

public class OnlinePurchase {

    public void processOrder(String fullName, String inn) throws InvalidInnException {
        if (!isValidInn(inn)) {
            throw new InvalidInnException("Недействительный ИНН: " + inn);
        }

        System.out.println("Заказ успешно оформлен для " + fullName + " с ИНН: " + inn);
    }

    private boolean isValidInn(String inn) {
        return inn != null && inn.matches("\\d{10}");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OnlinePurchase purchase = new OnlinePurchase();

        try {
            System.out.print("Введите ФИО: ");
            String fullName = scanner.nextLine();

            System.out.print("Введите ИНН: ");
            String inn = scanner.nextLine();

            purchase.processOrder(fullName, inn);
        } catch (InvalidInnException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

