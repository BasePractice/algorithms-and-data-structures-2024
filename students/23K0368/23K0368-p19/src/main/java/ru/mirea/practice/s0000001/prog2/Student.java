package ru.mirea.practice.s0000001.prog2;

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

    public static List<Student> setArray(List<Student> students) {
        return students;
    }

    public static void printStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println(student.name + ", age " + student.age + ", idNumber: " + student.idNumber + ", GPA: "
                    + student.gpa);
        }
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    // Метод compareTo() для сравнения студентов по idNumber
    @Override
    public int compareTo(Student other) {
        return Double.compare(other.gpa, this.gpa); // Сортировка по убыванию GPA
    }

    public void printStudent() {
        System.out.println(this.name + ", age " + this.age + ", idNumber: " + this.idNumber + ", GPA: "
                + this.gpa);
    }
}
