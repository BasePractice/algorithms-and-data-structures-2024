package ru.mirea.practice.s23k1138.task1;

import java.util.Date;

public abstract class Task1 {
    public static void main(String[] args) {
        String developerLastName = "Grigoriev";
        Date receivedDate = new Date();

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            System.out.println("Процесс был прерван.");
        }

        Date submittedDate = new Date();

        System.out.println("Фамилия разработчика: " + developerLastName);
        System.out.println("Дата и время получения задания: " + receivedDate);
        System.out.println("Дата и время сдачи задания: " + submittedDate);
    }
}