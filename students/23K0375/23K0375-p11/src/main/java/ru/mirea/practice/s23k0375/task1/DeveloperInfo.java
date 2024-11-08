package ru.mirea.practice.s23k0375.task1;

import java.util.Date;

public abstract class DeveloperInfo {
    public static void main(String[] args) {
        // Фамилия разработчика
        String developerLastName = "Шушпанов";

        // Дата и время получения задания
        Date assignmentDate = new Date();

        // Выводим информацию
        System.out.println("Фамилия разработчика: " + developerLastName);
        System.out.println("Дата и время получения задания: " + assignmentDate);

        // Дата и время сдачи задания (текущая дата и время)
        Date submissionDate = new Date();

        // Выводим информацию
        System.out.println("Дата и время сдачи задания: " + submissionDate);
    }
}
