package ru.mirea.practice.s0000001.task2;

import java.util.Arrays;
import java.util.Comparator;

public class StudentManager {
    private IStudent[] students;

    public StudentManager(IStudent[] students) {
        if (students == null) {
            throw new IllegalArgumentException("Список студентов не может быть null.");
        }
        this.students = students;
    }

    public void sortStudentsByScoreDescending() {
        Arrays.sort(students, Comparator.comparingDouble(IStudent::getAverageScore).reversed());
    }

    public IStudent findStudentByFullName(String fullName) throws StudentNotFoundException {
        if (fullName == null || fullName.trim().isEmpty()) {
            throw new IllegalArgumentException("Полное имя не может быть пустым.");
        }
        for (IStudent student : students) {
            if (student != null && student.getFullName().equalsIgnoreCase(fullName)) {
                return student;
            }
        }
        throw new StudentNotFoundException("Студент с ФИО " + fullName + " не найден.");
    }

    public void displayStudents() {
        if (students.length == 0) {
            System.out.println("Список студентов пуст.");
            return;
        }
        for (IStudent student : students) {
            if (student != null) {
                System.out.println("ФИО: " + student.getFullName() + ", Средний балл: " + student.getAverageScore());
            }
        }
    }
}
