package ru.mirea.practice.s0000001.task1;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Calendar;

public abstract class Main {

    public static void task1() {
        String developerSurname = "Иванов";
        Date dateReceived = new Date();
        System.out.println("Фамилия разработчика: " + developerSurname);
        System.out.println("Дата и время получения задания: " + dateReceived);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Date dateSubmitted = new Date();
        System.out.println("Дата и время сдачи задания: " + dateSubmitted);
    }

    public static void task2() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите дату (в формате yyyy-MM-dd): ");
            String userDateStr = scanner.nextLine();

            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            try {
                Date userDate = df.parse(userDateStr);
                Date currentDate = new Date();
                System.out.println("Текущая дата: " + df.format(currentDate));

                if (userDate.equals(currentDate)) {
                    System.out.println("Введенная дата совпадает с текущей.");
                } else if (userDate.before(currentDate)) {
                    System.out.println("Введенная дата раньше текущей.");
                } else {
                    System.out.println("Введенная дата позже текущей.");
                }
            } catch (Exception e) {
                System.out.println("Ошибка ввода даты.");
            }
        }
    }

    static class Student {
        private String name;
        private Date birthDate;

        public Student(String name, Date birthDate) {
            this.name = name;
            this.birthDate = birthDate;
        }

        public String getFormattedBirthDate(int formatStyle) {
            DateFormat df = DateFormat.getDateInstance(formatStyle);
            return df.format(birthDate);
        }

        @Override
        public String toString() {
            return "Студент: " + name + ", Дата рождения: " + getFormattedBirthDate(DateFormat.SHORT);
        }
    }

    public static void task3() {
        Student student = new Student("Иван Иванов", new GregorianCalendar(2000, Calendar.JANUARY, 15).getTime());
        System.out.println(student.toString());
        System.out.println("Полный формат даты: " + student.getFormattedBirthDate(DateFormat.FULL));
    }

    public static void task4() {
        try (Scanner scanner = new Scanner(System.in)) {
            int year = getIntInput(scanner, "Введите год: ");
            int month = getIntInput(scanner, "Введите месяц: ") - 1;
            int day = getIntInput(scanner, "Введите число: ");
            int hour = getIntInput(scanner, "Введите часы: ");
            int minute = getIntInput(scanner, "Введите минуты: ");

            Calendar calendar = new GregorianCalendar(year, month, day, hour, minute);
            Date date = calendar.getTime();
            System.out.println("Сформированная дата: " + date);
        }
    }

    private static int getIntInput(Scanner scanner, String message) {
        System.out.print(message);
        while (!scanner.hasNextInt()) {
            System.out.print("Некорректный ввод. Пожалуйста, введите целое число: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static void task5() {
        final int size = 100000;

        final List<Integer> arrayList = new ArrayList<>();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            arrayList.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("ArrayList добавление: " + (endTime - startTime) + " ms");

        final List<Integer> linkedList = new LinkedList<>();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            linkedList.add(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList добавление: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        arrayList.add(size / 2, -1);
        endTime = System.currentTimeMillis();
        System.out.println("ArrayList вставка в середину: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        linkedList.add(size / 2, -1);
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList вставка в середину: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        arrayList.remove(size / 2);
        endTime = System.currentTimeMillis();
        System.out.println("ArrayList удаление из середины: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        linkedList.remove(size / 2);
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList удаление из середины: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        arrayList.contains(-1);
        endTime = System.currentTimeMillis();
        System.out.println("ArrayList поиск элемента: " + (endTime - startTime) + " ms");

        startTime = System.currentTimeMillis();
        linkedList.contains(-1);
        endTime = System.currentTimeMillis();
        System.out.println("LinkedList поиск элемента: " + (endTime - startTime) + " ms");
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
}
