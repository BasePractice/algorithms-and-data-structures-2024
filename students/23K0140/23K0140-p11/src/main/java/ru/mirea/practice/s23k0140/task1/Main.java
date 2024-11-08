package ru.mirea.practice.s23k0140.task1;

import java.util.Date;

public final class Main {

    private Main() {

    }

    public static void main(String[] args) {
        String developerLastName = "Иванов";
        String assignmentReceivedDate = "2024-09-28 10:00:00";
        Date currentDate = new Date();
        System.out.println("Фамилия разработчика: " + developerLastName);
        System.out.println("Дата и время получения задания: " + assignmentReceivedDate);
        System.out.println("Дата и время сдачи задания: " + currentDate);
    }

}