package ru.mirea.practice.s0000001.task1;

import java.util.Date;

public abstract class TaskInfo {
    public static void main(String[] args) {

        String developerSurname = "Шарапов";


        Date dateReceived = new Date();
        System.out.println("Фамилия разработчика: " + developerSurname);
        System.out.println("Дата и время получения задания: " + dateReceived);


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        Date dateSubmitted = new Date();
        System.out.println("Дата и время сдачи задания: " + dateSubmitted);
    }
}
