package ru.mirea.practice.s0000001;

import java.util.Scanner;

/**
 * Клиент совершает покупку онлайн.
 * При оформлении заказа у пользователя запрашивается фио и номер ИНН.
 * В программе проверяется, действителен ли номер ИНН для такого клиента.
 * Исключение будет выдано в том случае, если введен недействительный ИНН.
 */

public abstract class Task1 {
    // Some shit that I need to put here
    static class Expired extends Exception {
        public Expired(String s) {
            super(s);
        }
    }

    public static void main(String[] args) throws Expired {
        try (Scanner sc = new Scanner(System.in)) {
            String inn = sc.nextLine();

            if ("228-420-007 69".equals(inn)) {
                System.out.println("Good.");
            } else {
                throw new Expired("ИНН истёк.");
            }
        }
    }
}
