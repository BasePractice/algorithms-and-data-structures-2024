package ru.mirea.practice.s23k0135.task1;

import java.util.Date;

public abstract class Task1 {
    public static void main(String[] args) {
        String developerSurname = "Znaydenova";// Фамилия разработчика
        String dateOfReceive = "07.11.24 23:34:00";// Дата и время получения задания
        System.out.println("Фамилия разработчика: " + developerSurname);// Вывод информации
        System.out.println("Дата и время получения задания: " + dateOfReceive);
        Date dateOfSubmit = new Date(); // Дата и время сдачи задания
        System.out.println("Дата и время сдачи задания: " + dateOfSubmit);
    }
}
