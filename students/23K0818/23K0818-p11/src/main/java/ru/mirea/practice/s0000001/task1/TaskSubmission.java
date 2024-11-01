package ru.mirea.practice.s0000001.task1;

import java.util.Date;

public abstract class TaskSubmission {
    public static void main(String[] args) {
        // Фамилия разработчика
        String developerLastName = "Диков";

        // Дата и время получения задания
        Date taskReceivedDate = new Date();

        // Вывод информации о получении задания
        System.out.println("Фамилия разработчика: " + developerLastName);
        System.out.println("Дата и время получения задания: " + taskReceivedDate);

        // Имитация работы над заданием
        try {
            Thread.sleep(5000); // Задержка на 5 секунд
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Дата и время сдачи задания
        Date taskSubmittedDate = new Date();

        // Вывод информации о сдаче задания
        System.out.println("Дата и время сдачи задания: " + taskSubmittedDate);
    }
}
