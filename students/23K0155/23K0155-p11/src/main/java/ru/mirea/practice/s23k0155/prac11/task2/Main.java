package ru.mirea.practice.s23k0155.prac11.task2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public abstract class Main {
    public static void main(String[] args) {
        final SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMMM dd HH:mm:ss");
        Calendar nowDate = Calendar.getInstance();
        Calendar enterDate = Calendar.getInstance();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите: г м д ч:м:с");
            enterDate.set(scanner.nextInt(), scanner.nextInt() - 1, scanner.nextInt());
            enterDate.set(Calendar.HOUR_OF_DAY, scanner.nextInt());
            enterDate.set(Calendar.MINUTE, scanner.nextInt());
            enterDate.set(Calendar.SECOND, scanner.nextInt());

            int difYer = Math.abs(nowDate.get(Calendar.YEAR) - enterDate.get(Calendar.YEAR));
            int difMon = Math.abs(nowDate.get(Calendar.MONTH) - enterDate.get(Calendar.MONTH));
            int difDay = Math.abs(nowDate.get(Calendar.DAY_OF_MONTH) - enterDate.get(Calendar.DAY_OF_MONTH));
            int difHour = Math.abs(nowDate.get(Calendar.HOUR_OF_DAY) - enterDate.get(Calendar.HOUR_OF_DAY));
            int difMin = Math.abs(nowDate.get(Calendar.MINUTE) - enterDate.get(Calendar.MINUTE));
            int difSec = Math.abs(nowDate.get(Calendar.SECOND) - enterDate.get(Calendar.SECOND));
            System.out.println("Введённое время: " + sdf.format(enterDate.getTime()));
            System.out.printf("Разница\nГоды: %d\nМесяца: %d\nДни: %d\nВремя %d:%d:%d", difYer,
                    difMon, difDay, difHour, difMin, difSec);
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
