package ru.mirea.practice.s0000001;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public final class TaskManager {
    private TaskManager() {

    }

    public static void main(String[] args) {
        String developerName = "Khan";
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        Date currentTimestamp = new Date();

        System.out.println("Разработчик: " + developerName);
        System.out.println("Дата получения: " + formatter.format(currentTimestamp));

        System.out.println("Введите дату и время сдачи задания в формате 'dd.MM.yyyy HH:mm':");
        try (Scanner inputScanner = new Scanner(System.in)) {
            String inputDate = inputScanner.nextLine();
            try {
                Date submissionTimestamp = formatter.parse(inputDate);
                compareDates(currentTimestamp, submissionTimestamp);
            } catch (ParseException e) {
                System.out.println("Ошибка");
            }
        }
    }

    private static void compareDates(Date current, Date submission) {
        if (submission.before(current)) {
            System.out.println("Задание сдано раньше времени получения.");
        } else if (submission.after(current)) {
            System.out.println("Задание сдано позже времени получения.");
        } else {
            System.out.println("Задание сдано в то же время, когда было получено.");
        }
    }
}