package ru.mirea.practice.s23k1158;

import java.util.Date;

public final class Developer {

    private Developer() {

    }

    public static void main(String[] args) {
        String developerLastName = "Иванов";
        String assignmentReceivedDate = "2024-09-24 10:00:00";
        Date currentDate = new Date();
        System.out.println("Фамилия разработчика: " + developerLastName);
        System.out.println("Дата и время получения задания: " + assignmentReceivedDate);
        System.out.println("Дата и время сдачи задания: " + currentDate);
    }


}
