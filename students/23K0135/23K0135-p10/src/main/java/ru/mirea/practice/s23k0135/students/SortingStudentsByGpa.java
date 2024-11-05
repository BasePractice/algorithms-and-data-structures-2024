package ru.mirea.practice.s23k0135.students;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingStudentsByGpa {
    private final List<Student> students;

    public SortingStudentsByGpa() {
        students = new ArrayList<>();
    }

    // Метод для заполнения списка студентов
    public void setArray(List<Student> studentList) {
        students.clear(); // Очищаем текущий список студентов
        students.addAll(studentList); // Заполняем новый список
    }

    // Метод для сортировки по GPA
    public void sortByGpa() {
        Collections.sort(students, Comparator.comparingDouble(Student::getGpa).reversed());
    }

    // Метод для сортировки по имени
    public void sortByName() {
        Collections.sort(students, Comparator.comparing(Student::getName).reversed());
    }

    // Метод для сортировки по выбранному полю
    public void sortByField(Comparator<Student> comparator) {
        Collections.sort(students, comparator.reversed());
    }

    // Метод для вывода списка студентов
    public void outArray() {
        System.out.println("\nСписок студентов:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
