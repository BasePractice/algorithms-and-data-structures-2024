package ru.mirea.practice.s23f0011.task3;

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}