package ru.mirea.practice.s23k0087.task3;

public abstract class Tester {
    public static void main(String[] args) {
        Student student = new Student("Даниил", "Абсулов", 19);
        student.setBirthday("08.07.2005");
        System.out.println(student.toString());
    }
}
