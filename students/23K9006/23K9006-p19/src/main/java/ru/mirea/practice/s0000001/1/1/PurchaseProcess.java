package ru.mirea.practice.s0000001;

import java.util.Scanner;

public final class PurchaseProcess {

    private PurchaseProcess() {

    }

    public static void main(String[] args) {
        try (Scanner inputScanner = new Scanner(System.in)) {
            System.out.print("Введите полное имя пользователя: ");
            String userName = inputScanner.nextLine();

            System.out.print("Введите номер ИНН пользователя: ");
            String userTaxId = inputScanner.nextLine();

            OnlineUser onlineUser = new OnlineUser(userName, userTaxId);

            try {
                onlineUser.checkTaxId();
                System.out.println("Покупка успешно оформлена для пользователя: " + userName);
            } catch (InvalidTaxIdException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
