package ru.mirea.practice.s0000001.prog4;

import java.util.List;

class Student implements Comparable<Student> {
    String firstName;
    int age;
    double gpa;
    int id;

    public Student(String firstName, int age, double gpa, int id) {
        this.firstName = firstName;
        this.age = age;
        this.gpa = gpa;
        this.id = id;
    }

    // Метод compareTo() для сравнения студентов по GPA
    @Override
    public int compareTo(Student other) {
        // Сравнение по GPA в порядке убывания
        if (this.gpa > other.gpa) {
            return -1; // this > other
        } else if (this.gpa < other.gpa) {
            return 1; // this < other
        } else {
            return 0; // this == other
        }
    }

    public static void printStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println(student.firstName + ",  Возраст: " + student.age + ", GPA: " + student.gpa + ", ID: " + student.id);
        }
        System.out.println();
    }
}
