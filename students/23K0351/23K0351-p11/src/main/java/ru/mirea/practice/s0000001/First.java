package ru.mirea.practice.s0000001;

import java.util.Date;

abstract class First {
    public static void main(String[] args) throws InterruptedException {
        String devSurname = "Коновалов";

        Date dateReceived = new Date();
        Thread.sleep(2000);
        Date dateSubmitted = new Date();

        System.out.println("Фамилия разработчика: " + devSurname);
        System.out.println("Дата и время получения задания: " + dateReceived);
        System.out.println("Дата и время сдачи задания: " + dateSubmitted);
    }
}