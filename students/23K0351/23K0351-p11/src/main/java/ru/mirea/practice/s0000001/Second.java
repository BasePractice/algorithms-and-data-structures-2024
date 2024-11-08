package ru.mirea.practice.s0000001;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Scanner;

abstract class Second {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {

            Date currentDate = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");


            System.out.println("Текущая дата: " + dateFormat.format(currentDate));


            System.out.print("Введите дату (в формате dd-MM-yyyy): ");
            String userInput = scanner.nextLine();

            try {

                Date userDate = dateFormat.parse(userInput);

                if (userDate.before(currentDate)) {
                    System.out.println("Введенная дата " + userInput + " раньше текущей даты.");
                } else if (userDate.after(currentDate)) {
                    System.out.println("Введенная дата " + userInput + " позже текущей даты.");
                } else {
                    System.out.println("Введенная дата совпадает с текущей датой.");
                }
            } catch (ParseException e) {
                System.out.println("Некорректный формат даты. Пожалуйста, используйте формат dd-MM-yyyy.");
            }


        }
    }
}
