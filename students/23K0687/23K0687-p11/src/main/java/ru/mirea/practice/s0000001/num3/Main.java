package ru.mirea.practice.s0000001.num3;

import java.util.Date;

public final class Main {
    private Main() {
    }

    public static void main(String[] args) {
        String f = "Иванов";
        Date d1 = new Date();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Date d2 = new Date();

        System.out.println("Фамилия: " + f);
        System.out.println("Дата и время получения задания: " + d1);
        System.out.println("Дата и время сдачи задания: " + d2);
    }
}

