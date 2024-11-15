package ru.mirea.practice.s23l0908.task2;

public class Student {
    private String name;
    private int age;
    private String group;
    private double gpa;

    public Student(String name, int age, String group, double gpa) {
        this.name = name;
        this.age = age;
        this.group = group;
        this.gpa = gpa;
    }

    @SuppressWarnings("unused")

    public void setName(String name) {
        this.name = name;
    }

    @SuppressWarnings("unused")

    public void setAge(int age) {
        this.age = age;
    }

    @SuppressWarnings("unused")

    public void setGroup(String group) {
        this.group = group;
    }

    @SuppressWarnings("unused")

    public String getName() {
        return name;
    }

    @SuppressWarnings("unused")

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @SuppressWarnings("unused")

    public int getAge() {
        return age;
    }

    @SuppressWarnings("unused")

    public String getGroup() {
        return group;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{"
            + "name='"
            + name
            + '\''
            +
            ", age="
            + age
            +
            ", group='"
            + group
            + '\''
            +
            ", gpa="
            + gpa
            +
            '}';
    }
}
