package ru.mirea.practice.s0000001.task7;

public abstract class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract String getType(); // Абстрактный метод для получения типа

    @Override
    public String toString() {
        return "Имя: " + name + ", Возраст: " + age;
    }
}