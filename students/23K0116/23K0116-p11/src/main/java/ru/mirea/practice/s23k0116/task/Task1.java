package ru.mirea.practice.s23k0116.task;

import java.util.Date;

public abstract class Task1 {
    public static void main(String[] args) {
        String developerLastName = "Grigoriev";
        Date receivedDate = new Date();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Процесс был прерван.");
        }

        Date submittedDate = new Date();

        System.out.println("Фамилия разработчика: " + developerLastName);
        System.out.println("Дата и время получения задания: " + receivedDate);
        System.out.println("Дата и время сдачи задания: " + submittedDate);
    }
}
