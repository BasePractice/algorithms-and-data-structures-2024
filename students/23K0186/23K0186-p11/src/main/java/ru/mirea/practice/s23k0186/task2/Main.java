package ru.mirea.practice.s23k0089.task2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public abstract class Main {
    public static void main(String[] args) {
        final SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMMM dd HH:mm:ss");

        Calendar nowDate = Calendar.getInstance();
        Calendar enterDate = Calendar.getInstance();

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Введите дату в формате |год месяц день| (пример: 2024 01 01)");
            enterDate.set(scanner.nextInt(), scanner.nextInt() - 1, scanner.nextInt());

            System.out.println("Введите час в формате |часы| (пример: 13)");
            enterDate.set(Calendar.HOUR_OF_DAY, scanner.nextInt());

            System.out.println("Введите минуту в формате |минуты| (пример: 45)");
            enterDate.set(Calendar.MINUTE, scanner.nextInt());

            System.out.println("Введите секунду в формате |секунды| (пример: 30)");
            enterDate.set(Calendar.SECOND, scanner.nextInt());

            int difYear = Math.abs(nowDate.get(Calendar.YEAR) - enterDate.get(Calendar.YEAR));
            int difMonth = Math.abs(nowDate.get(Calendar.MONTH) - enterDate.get(Calendar.MONTH));
            int difDay = Math.abs(nowDate.get(Calendar.DAY_OF_MONTH) - enterDate.get(Calendar.DAY_OF_MONTH));
            int difHour = Math.abs(nowDate.get(Calendar.HOUR_OF_DAY) - enterDate.get(Calendar.HOUR_OF_DAY));
            int difMinutes = Math.abs(nowDate.get(Calendar.MINUTE) - enterDate.get(Calendar.MINUTE));
            int difSeconds = Math.abs(nowDate.get(Calendar.SECOND) - enterDate.get(Calendar.SECOND));

            System.out.println("Введённое время: " + sdf.format(enterDate.getTime()));
            System.out.printf("Разница:\nГоды = %d\nМесяца = %d\nДни = %d\nЧасы, минуты и секунды = %d:%d:%d", difYear,
                difMonth, difDay, difHour, difMinutes, difSeconds);

        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
