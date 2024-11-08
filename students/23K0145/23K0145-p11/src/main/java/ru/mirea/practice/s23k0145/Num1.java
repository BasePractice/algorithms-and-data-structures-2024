package ru.mirea.practice.s23k0145;

import java.util.Date;

public final class Num1 {

    private Num1() {

    }

    public static void main(String[] args) {
        String developerSurname = "Иванов";

        Date receivedDate = new Date();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Процесс был прерван.");
        }

        Date submittedDate = new Date();

        System.out.println("Фамилия разработчика: " + developerSurname);
        System.out.println("Дата и время получения задания: " + receivedDate);
        System.out.println("Дата и время сдачи задания: " + submittedDate);
    }
}
