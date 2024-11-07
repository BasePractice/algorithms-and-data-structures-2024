package ru.mirea.practice.s0000011;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class Ypr1 {
    private Ypr1() {
        // По традиции ничего нет
    }

    public static void main(String[] args) {
        String developerSurname = "Мясников";
        Date assignedDate = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println("Фамилия разработчика: " + developerSurname);
        System.out.println("Дата получения задания: " + formatter.format(assignedDate));

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Date submissionDate = new Date();
        System.out.println("Дата сдачи задания: " + formatter.format(submissionDate));
    }
}
