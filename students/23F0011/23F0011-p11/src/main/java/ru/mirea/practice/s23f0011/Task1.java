package ru.mirea.practice.s23f0011;

import java.util.Date;

public abstract class Task1 {
    public static void main(String[] args) {
        // Фамилия разработчика
        String developerSurname = "Муртазин";

        // Дата и время получения задания (указываем вручную)
        String assignmentReceived = "2024-11-01 10:00";

        // Текущая дата и время сдачи задания
        Date submissionDate = new Date();

        // Вывод информации
        System.out.println("Фамилия разработчика: " + developerSurname);
        System.out.println("Дата и время получения задания: " + assignmentReceived);
        System.out.println("Дата и время сдачи задания: " + submissionDate);
    }
}
