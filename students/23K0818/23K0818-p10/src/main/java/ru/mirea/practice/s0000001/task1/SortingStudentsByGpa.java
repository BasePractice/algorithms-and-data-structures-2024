package ru.mirea.practice.s0000001.task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingStudentsByGpa {
    private List<Student> iDNumber;

    public SortingStudentsByGpa() {
        iDNumber = new ArrayList<>();
    }

    // Метод для заполнения массива
    public void setArray(List<Student> students) {
        iDNumber.addAll(students);
    }

    // Метод для вывода массива студентов
    public void outArray() {
        for (Student student : iDNumber) {
            System.out.println(student);
        }
    }

    // Метод для быстрой сортировки
    public void quickSort() {
        iDNumber.sort(Comparator.comparingDouble(Student::getGpa).reversed());
    }

    // Метод для сортировки слиянием
    public void mergeSort() {
        iDNumber.sort(Comparator.comparingDouble(Student::getGpa).reversed());
    }

    // Метод для сортировки по другому полю (например, по имени)
    public void sortByField(Comparator<Student> comparator) {
        iDNumber.sort(comparator);
    }

    public static void main(String[] args) {
        final SortingStudentsByGpa sorter = new SortingStudentsByGpa();

        // Заполнение массива студентов
        List<Student> students = new ArrayList<>();
        students.add(new Student("Иван", "Иванов", "Информатика", 2, "ИКБО-01-21", 3.8));
        students.add(new Student("Петр", "Петров", "Математика", 3, "МКБО-02-21", 4.0));
        students.add(new Student("Сидор", "Сидоров", "Физика", 1, "ФКБО-01-21", 3.5));
        students.add(new Student("Алексей", "Алексеев", "Химия", 4, "ХКБО-01-21", 3.9));

        sorter.setArray(students);

        // Вывод исходного массива
        System.out.println("Исходный массив:");
        sorter.outArray();

        // Сортировка по среднему баллу (быстрая сортировка)
        sorter.quickSort();
        System.out.println("\nОтсортированный массив по среднему баллу (быстрая сортировка):");
        sorter.outArray();

        // Сортировка по среднему баллу (сортировка слиянием)
        sorter.mergeSort();
        System.out.println("\nОтсортированный массив по среднему баллу (сортировка слиянием):");
        sorter.outArray();

        // Сортировка по имени
        sorter.sortByField(Comparator.comparing(Student::getFirstName));
        System.out.println("\nОтсортированный массив по имени:");
        sorter.outArray();
    }
}
