package ru.mirea.practice.s0000001.num1;

import java.util.Scanner;

public class Main {

    public static class InvInnEx extends Exception {
        public InvInnEx(String msg) {
            super(msg);
        }
    }

    public void procOrder() throws InvInnEx {
        Scanner sc = null;
        try {
            sc = new Scanner(System.in);
            System.out.print("Введите ФИО клиента: ");
            String fio = sc.nextLine();

            System.out.print("Введите ИНН клиента: ");
            String inn = sc.nextLine();

            if (!isValidInn(inn)) {
                throw new InvInnEx("Недействительный ИНН");
            }

            System.out.println("Заказ принят на имя: " + fio);
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }

    public boolean isValidInn(String inn) {
        if (inn == null || inn.length() != 12) {
            return false;
        }
        try {
            Long.parseLong(inn);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Main app = new Main();

        try {
            app.procOrder();
        } catch (InvInnEx e) {
            System.out.println(e.getMessage());
        }
    }
}
