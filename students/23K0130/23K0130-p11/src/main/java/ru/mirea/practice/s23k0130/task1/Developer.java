package ru.mirea.practice.s23k0130.task1;

import java.util.Date;

public abstract class Developer {
    public static void main(String[] args) {
        String developerLastName = "Еров";
        String assignmentReceivedDate = "Fri Nov 01 10:00:00 MSK 2024";
        Date currentDate = new Date();
        System.out.println("Фамилия разработчика: " + developerLastName);
        System.out.println("Дата и время получения задания: " + assignmentReceivedDate);
        System.out.println("Дата и время сдачи задания: " + currentDate);
    }
}
