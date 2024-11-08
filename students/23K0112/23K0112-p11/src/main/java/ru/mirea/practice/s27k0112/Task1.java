package ru.mirea.practice.s27k0112;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public final class Task1 {
    private Task1() {

    }

    public static void main(String[] args) {
        String developer = "Gatiyatullin";
        SimpleDateFormat dateFormatter = new SimpleDateFormat("dd.MM.yyyy HH:mm");

        Date currentDate = new Date();

        System.out.println("Фамилия разработчика: " + developer);
        System.out.println("Дата и время получения задания: " + dateFormatter.format(currentDate));

        System.out.println("Введите дату и время сдачи задания в формате 'dd.MM.yyyy HH:mm':");
        try (Scanner sc = new Scanner(System.in)) {
            String userInput = sc.nextLine();
            try {
                Date finalDate = dateFormatter.parse(userInput);
                if (finalDate.before(currentDate)) {
                    System.out.println("Задание сдано раньше времени получения.");
                } else if (finalDate.after(currentDate)) {
                    System.out.println("Задание сдано позже времени получения.");
                } else {
                    System.out.println("Задание сдано в то же время, когда было получено.");
                }
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
