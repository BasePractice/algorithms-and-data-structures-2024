package ru.mirea.practice.s0000001.prog3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public abstract class Main {
    public static void main(String[] args) {
        List<Student> students1 = new ArrayList<>();
        students1.add(new Student("Иван", 18));
        students1.add(new Student("Анна", 19));
        students1.add(new Student("Дмитрий", 17));

        List<Student> students2 = new ArrayList<>();
        students2.add(new Student("Елена", 19));
        students2.add(new Student("Сергей", 18));
        students2.add(new Student("Мария", 17));

        List<Student> allStudents = new ArrayList<>(students1);
        allStudents.addAll(students2);

        // Сортировка по имени:
        List<Student> mergedStudents = MargeSort.mergeSort(allStudents, Comparator.comparing(Student::getName));
        System.out.println("Отсортированный список по имени:");
        for (Student mergedStudent : mergedStudents) {
            System.out.println(" Name " + mergedStudent.name + " Age " + mergedStudent.age);
        }

        // Сортировка по возрасту:
        mergedStudents = MargeSort.mergeSort(allStudents, Comparator.comparingInt(Student::getAge));
        System.out.println("\nОтсортированный список по возрасту:");
        for (Student mergedStudent : mergedStudents) {
            System.out.println(" Name " + mergedStudent.name + " Age " + mergedStudent.age);
        }
    }
}
