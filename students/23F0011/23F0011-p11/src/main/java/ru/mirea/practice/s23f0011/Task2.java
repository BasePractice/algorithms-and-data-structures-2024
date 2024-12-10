package ru.mirea.practice.s23f0011;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public abstract class Task2 {
    public static void main(String[] args) {
        // Создаем объект Scanner для ввода данных от пользователя
        try (Scanner scanner = new Scanner(System.in)) {

            // Получаем текущую дату
            Calendar currentDate = GregorianCalendar.getInstance();
            System.out.println("Текущая дата: " + currentDate.getTime());

            // Запрашиваем у пользователя ввод даты
            System.out.print("Введите дату (формат: ГГГГ-ММ-ДД ЧЧ:ММ:СС): ");
            String userInput = scanner.nextLine();

            // Разделяем введенную строку на составляющие
            String[] dateTimeParts = userInput.split(" ");
            String[] dateParts = dateTimeParts[0].split("-");
            String[] timeParts = dateTimeParts[1].split(":");

            // Создаем объект Calendar для введенной даты
            Calendar userDate = new GregorianCalendar(
                Integer.parseInt(dateParts[0]),  // Год
                Integer.parseInt(dateParts[1]) - 1,  // Месяцы начинаются с 0
                Integer.parseInt(dateParts[2]),
                Integer.parseInt(timeParts[0]),
                Integer.parseInt(timeParts[1]),
                Integer.parseInt(timeParts[2])
            );

            // Сравниваем даты
            if (userDate.before(currentDate)) {
                System.out.println("Введенная дата раньше текущей даты.");
            } else if (userDate.after(currentDate)) {
                System.out.println("Введенная дата позже текущей даты.");
            } else {
                System.out.println("Введенная дата совпадает с текущей датой.");
            }
        }

    }
}
