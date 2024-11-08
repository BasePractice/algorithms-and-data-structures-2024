package ru.mirea.practice.s0000001;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class First {
    public static void main(String[] args) {
        String developer = "Валеева";
        String taskReceivedDate = "05.10.2024 09:00:00";
        SimpleDateFormat dateFormatter = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

        Date deliveryDate = new Date();
        System.out.println("Фамилия разработчика: " + developer);
        System.out.println("Дата и время получения задания: " + taskReceivedDate);
        System.out.println("Дата и время сдачи задания: " + dateFormatter.format(deliveryDate));
    }
}