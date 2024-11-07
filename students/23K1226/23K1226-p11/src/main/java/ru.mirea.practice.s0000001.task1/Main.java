package ru.mirea.practice.s0000001.task1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public final class Main {
    private Main() {
        // Приватный конструктор
    }

    public static void main(String[] args) {
        // Задание 1
        System.out.println("Фамилия разработчика: Мясников");
        Date dateAssignment = new Date();
        System.out.println("Дата и время получения задания: " + dateAssignment);
        Date dateSubmission = new Date(System.currentTimeMillis());
        System.out.println("Дата и время сдачи задания: " + dateSubmission);

        // Задание 2
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите дату (yyyy-MM-dd): ");
            String inputDate = scanner.nextLine();
            Date currentDate = new Date();
            try {
                Date userDate = new SimpleDateFormat("yyyy-MM-dd").parse(inputDate);
                System.out.println("Текущая дата: " + currentDate);
                System.out.println("Введённая дата: " + userDate);
                System.out.println("Результат сравнения: " + currentDate.compareTo(userDate));
            } catch (Exception e) {
                System.out.println("Ошибка ввода даты.");
            }
        }

        // Задание 3
        Student student = new Student("Иванов", Calendar.getInstance());
        System.out.println(student);

        // Задание 4
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите год, месяц, число (yyyy MM dd): ");
            int year = scanner.nextInt();
            int month = scanner.nextInt();
            int day = scanner.nextInt();
            System.out.print("Введите часы и минуты (HH mm): ");
            int hours = scanner.nextInt();
            int minutes = scanner.nextInt();
            Calendar calendar = Calendar.getInstance();
            calendar.set(year, month - 1, day, hours, minutes);
            Date customDate = calendar.getTime();
            System.out.println("Созданная дата: " + customDate);
        }

        // Задание 5
        final List<Integer> arrayList = new ArrayList<>();
        final List<Integer> linkedList = new LinkedList<>();

        final long arrayListAddTime;
        final long linkedListAddTime;
        final long arrayListGetTime;
        final long linkedListGetTime;

        long startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }
        arrayListAddTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }
        linkedListAddTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            arrayList.get(i);
        }
        arrayListGetTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            linkedList.get(i);
        }
        linkedListGetTime = System.nanoTime() - startTime;

        System.out.println("ArrayList добавление: " + arrayListAddTime + " нс");
        System.out.println("LinkedList добавление: " + linkedListAddTime + " нс");
        System.out.println("ArrayList получение: " + arrayListGetTime + " нс");
        System.out.println("LinkedList получение: " + linkedListGetTime + " нс");
    }
}
