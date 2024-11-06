package ru.mirea.practice.s23k0093;

import java.util.Date;

public abstract class DeveloperInfo {
    public static void main(String[] args) {
        String developerSurname = "Афанасьева";
        Date currentDate = new Date(); // Дата и время получения задания

        // Задаём дату и время сдачи задания
        Date submissionDate = new Date(); // Временно установка на текущее время

        System.out.println("Фамилия разработчика: " + developerSurname);
        System.out.println("Дата и время получения задания: " + currentDate);
        System.out.println("Дата и время сдачи задания: " + submissionDate);
    }
}
