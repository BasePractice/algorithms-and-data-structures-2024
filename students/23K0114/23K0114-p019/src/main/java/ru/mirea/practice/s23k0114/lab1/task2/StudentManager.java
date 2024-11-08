package ru.mirea.practice.s23k0114.lab1.task2;

import java.util.Arrays;
import java.util.Comparator;

public class StudentManager {
    private IStudent[] students;

    public StudentManager(IStudent[] students) {
        this.students = students;
    }

    public void sortStudentsByScore() {
        Arrays.sort(students, Comparator.comparingDouble(IStudent::getAverageScore).reversed());
    }

    public IStudent findStudentByFullName(String fullName) throws StudentNotFoundException {
        for (IStudent student : students) {
            if (student.getFullName().equalsIgnoreCase(fullName)) {
                return student;
            }
        }
        throw new StudentNotFoundException("Студент с ФИО " + fullName + " не найден.");
    }

    public void displayStudents() {
        for (IStudent student : students) {
            System.out.println("ФИО: " + student.getFullName() + ", Средний балл: " + student.getAverageScore());
        }
    }
}
