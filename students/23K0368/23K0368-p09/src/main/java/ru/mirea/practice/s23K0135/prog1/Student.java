package ru.mirea.practice.s23K0135.prog1;

public class Student {
    public String name;
    public Integer age;
    public int idNumber;

    public Student(String name, Integer age, int idNumber) {
        this.name = name;
        this.age = age;
        this.idNumber = idNumber;
    }

    public static void printStudents(Student[] students) {
        for (Student student : students) {
            System.out.println(student.name + " " + student.age + ", iDNumber: " + student.idNumber);
        }
        System.out.println();
    }
}
