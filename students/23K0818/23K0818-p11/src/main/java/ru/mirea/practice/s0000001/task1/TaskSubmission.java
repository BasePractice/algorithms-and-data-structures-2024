package ru.mirea.practice.s0000001.task1;

import java.util.Date;

public abstract class TaskSubmission {
    public static void main(String[] args) {
        String developerLastName = "Диков";

        Date taskReceivedDate = new Date();

        System.out.println("Фамилия разработчика: " + developerLastName);
        System.out.println("Дата и время получения задания: " + taskReceivedDate);

        try {
            Thread.sleep(5000); // Задержка на 5 секунд
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Date taskSubmittedDate = new Date();

        System.out.println("Дата и время сдачи задания: " + taskSubmittedDate);
    }
}
