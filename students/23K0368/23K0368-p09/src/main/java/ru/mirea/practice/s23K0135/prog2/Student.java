package ru.mirea.practice.s23K0135.prog2;

import java.util.List;

public class Student implements Comparable<Student> {
    public String name;
    public Integer age;
    public int idNumber;
    public int gpa;

    public Student(String name, Integer age, int idNumber, int gpa) {
        this.name = name;
        this.age = age;
        this.idNumber = idNumber;
        this.gpa = gpa;
    }

    public static void printStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println(student.name + ", age " + student.age + ", iDNumber: " + student.idNumber + ", GPA: "
                    + student.gpa);
        }
        System.out.println();
    }

    // Метод compareTo() для сравнения студентов по iDNumber
    @Override
    public int compareTo(Student other) {
        return Double.compare(other.gpa, this.gpa); // Сортировка по убыванию GPA
    }
}
