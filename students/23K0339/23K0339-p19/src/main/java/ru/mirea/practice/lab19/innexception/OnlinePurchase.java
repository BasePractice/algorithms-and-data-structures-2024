package ru.mirea.practice.lab19.innexception;

import java.util.Scanner;


public class OnlinePurchase {
    public static void main(String[] args) {
        OnlinePurchase order = new OnlinePurchase();

        try {
            order.processOrder();
        } catch (InvalidInnException e) {
            System.out.println(e.getMessage());
        }
    }

    public void processOrder() throws InvalidInnException {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Введите ФИО: ");
            String fio = scanner.nextLine();

            System.out.print("Введите номер ИНН: ");
            String inn = scanner.nextLine();

            if (!isValidInn(inn)) {
                throw new InvalidInnException("Недействительный ИНН: " + inn);
            }

            System.out.println("Заказ оформлен успешно для " + fio);
        }
    }

    public boolean isValidInn(String inn) {
        return inn.length() == 12 || inn.length() == 10 && inn.matches("\\d+");
    }
}
