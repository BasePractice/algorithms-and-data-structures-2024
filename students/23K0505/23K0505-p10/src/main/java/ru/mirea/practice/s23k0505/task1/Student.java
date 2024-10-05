package ru.mirea.practice.s23k0505.task1;

public class Student {
    private final String firstName;
    private final String secondName;
    private final String idNumber;
    private final int age;
    private String specialty;
    private String group;
    private double gpa;

    public Student(String firstName, String secondName, int age, String idNumber) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.idNumber = idNumber;
    }

    public Student(String firstName, String secondName, int age, String idNumber, String specialty, String group) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.idNumber = idNumber;
        this.specialty = specialty;
        this.group = group;
    }

    @Override
    public String toString() {
        String s1 = String.format("\nStudent{%s %s %d лет", firstName, secondName, age);
        return String.format("%-30s %s Направление: %-8s %s Средний балл: %.2f}", s1, idNumber, specialty, group, gpa);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public int getAge() {
        return age;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}