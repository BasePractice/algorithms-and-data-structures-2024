package ru.mirea.practice.s23k0690.task2;

class Student {
    private String name;
    private double gpa;
    private int age;

    public Student(String name, double gpa, int age) {
        this.name = name;
        this.gpa = gpa;
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Студент: " + name + ", Балл= " + gpa + ", Возраст= " + age;
    }
}