package ru.mirea.practice.s0000001.task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentManager {
    private List<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void sortStudents() {
        students.sort(Comparator.comparingDouble(Student::getAverageGrade).reversed());
    }

    public Student findStudentByName(String fullName) throws StudentNotFoundException {
        for (Student student : students) {
            if (student.getFullName().equals(fullName)) {
                return student;
            }
        }
        throw new StudentNotFoundException("Студент с ФИО '" + fullName + "' не найден!");
    }

    public void printStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

