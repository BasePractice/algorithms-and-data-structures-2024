package ru.mirea.practice.s23k0089.task1;

public class Student implements Comparable<Student> {
    String name;
    String idNumber;
    int age;

    public Student(String name, String idNumber, int age) {
        this.name = name;
        this.idNumber = idNumber;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{name = " + name + ", idNumber = " + idNumber + ", age = " + age + '}';
    }

    @Override
    public int compareTo(Student student) {
        return this.idNumber.compareTo(student.idNumber);
    }
}