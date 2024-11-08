package ru.mirea.practice.s0000001.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import java.util.List;


public class LabClass {
    private List<Student> students;  // Использование интерфейса List вместо ArrayList

    public LabClass() {
        students = new ArrayList<>();  // Инициализация через интерфейс
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void sortStudentsByScore() {
        Collections.sort(students, Comparator.comparingDouble(Student::getAverageScore));
    }

    public Student findStudentByName(String name) throws StudentNotFoundException {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        throw new StudentNotFoundException("Student with name " + name + " not found.");
    }

    public void displayStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
