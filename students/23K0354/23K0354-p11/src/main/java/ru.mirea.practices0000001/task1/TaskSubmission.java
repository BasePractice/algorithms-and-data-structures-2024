package ru.mirea.practices0000001.task1;

import java.util.Date;

public abstract class TaskSubmission {
    public static void main(String[] args) {
        try {
            String developerLastName = "Куракин";

            Date taskReceivedDate = new Date();

            long currentTimeMillis = System.currentTimeMillis();
            long submissionTimeMillis = currentTimeMillis + (2 * 60 * 60 * 1000); // Добавляем 2 часа
            Date taskSubmissionDate = new Date(submissionTimeMillis);

            System.out.println("Фамилия разработчика: " + developerLastName);
            System.out.println("Дата и время получения задания: " + taskReceivedDate);
            System.out.println("Дата и время сдачи задания: " + taskSubmissionDate);

        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }
}