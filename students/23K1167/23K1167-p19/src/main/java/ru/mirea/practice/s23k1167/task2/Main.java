package ru.mirea.practice.s23k1167.task2;

import java.util.Comparator;
import java.util.Scanner;

public final class Main {
    private Main() {

    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Создаем массив студентов
            Student[] students = new Student[]{
                new Student("Иванов Иван Иванович", "Инженерия", 3, "Группа A", 4.5),
                new Student("Петров Петр Петрович", "Математика", 2, "Группа B", 3.8),
                new Student("Сидоров Сидор Сидорович", "Физика", 4, "Группа C", 4.9)
            };

            SortingStudentsByGpa sortingClass = new SortingStudentsByGpa();
            sortingClass.setArray(students);

            // Сортировка студентов по среднему баллу
            sortingClass.quicksort(Comparator.comparingDouble(Student::getGpa).reversed());

            // Вывод отсортированного списка студентов
            System.out.println("Список студентов после сортировки:");
            sortingClass.outArray();

            // Поиск студента по ФИО
            System.out.print("Введите ФИО студента для поиска: ");

            try {
                String nameToSearch = scanner.nextLine();
                if (nameToSearch.isEmpty()) {
                    throw new EmptyStringException("Поле для поиска не может быть пустым.");
                }
                Student foundStudent = sortingClass.findStudentByName(nameToSearch);
                System.out.println("Найденный студент: " + foundStudent);

            } catch (StudentNotFoundException | EmptyStringException e) {
                System.out.println("Ошибка: " + e.getMessage());

            } finally {
                scanner.close(); // Закрываем сканер после использования
            }
        }
    }
}
