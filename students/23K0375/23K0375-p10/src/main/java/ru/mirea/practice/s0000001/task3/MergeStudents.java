package ru.mirea.practice.s0000001.task3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public abstract class MergeStudents {
    // Метод для объединения и сортировки двух списков студентов
    public static List<Student> mergeAndSort(List<Student> list1, List<Student> list2, Comparator<Student> comparator) {
        List<Student> mergedList = new ArrayList<>();
        mergedList.addAll(list1);
        mergedList.addAll(list2);
        mergedList.sort(comparator);
        return mergedList;
    }

    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student("Иван", "Иванов", "Информатика", 2, "ИТ-21", 3.8));
        list1.add(new Student("Петр", "Петров", "Математика", 3, "МТ-31", 4.2));

        List<Student> list2 = new ArrayList<>();
        list2.add(new Student("Анна", "Сидорова", "Физика", 1, "Ф-11", 4.5));
        list2.add(new Student("Елена", "Смирнова", "Химия", 2, "Х-21", 3.9));

        // Объединение и сортировка по среднему баллу
        List<Student> mergedListByGP = mergeAndSort(list1, list2, Comparator.comparingDouble(Student::getGpa).reversed());
        System.out.println("Отсортированный список по GPA:");
        for (Student student : mergedListByGP) {
            System.out.println(student);
        }

        // Объединение и сортировка по имени
        List<Student> mergedListByName = mergeAndSort(list1, list2, Comparator.comparing(Student::getFirstName));
        System.out.println("\nОтсортированный список по имени:");
        for (Student student : mergedListByName) {
            System.out.println(student);
        }
    }
}
