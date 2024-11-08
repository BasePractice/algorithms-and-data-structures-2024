package ru.mirea.practice.s23k0215.task1;

import java.util.Date;

public abstract class AssignmentInfo {
    public static void main(String[] args) {

        String developerSurname = "Журавлева";

        Date assignmentReceived = new Date(System.currentTimeMillis());

        System.out.println("Фамилия разработчика: " + developerSurname);
        System.out.println("Дата и время получения задания: " + assignmentReceived);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Date assignmentSubmitted = new Date();

        System.out.println("Дата и время сдачи задания: " + assignmentSubmitted);
    }
}

