package ru.mirea.practice.s0000001;

import java.util.Scanner;

public final class OnlinePurchase {

    private OnlinePurchase() {

    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите ФИО клиента: ");
            String fullName = scanner.nextLine();

            System.out.print("Введите номер ИНН клиента: ");
            String inn = scanner.nextLine();

            OnlineClient client = new OnlineClient(fullName, inn);

            try {
                client.validateInn();
                System.out.println("Заказ успешно оформлен для клиента: " + fullName);
            } catch (InvalidInnException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
