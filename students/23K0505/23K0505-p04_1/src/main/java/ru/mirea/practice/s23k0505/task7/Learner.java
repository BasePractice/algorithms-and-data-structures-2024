package ru.mirea.practice.s23k0505.task7;

public class Learner {
    String name;
    int age;
    float averageGrade;

    public Learner() {
        // Default constructor
    }

    public Learner(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Learner(String name, int age, float grade) {
        Learner learner = new Learner(name, age);
        this.name = learner.name;
        this.age = learner.age;
        this.averageGrade = grade;
    }

    public void study() {
        System.out.println(name + " учится");
    }

    @Override
    public String toString() {
        return "Учащийся{" + "ФИО= " + name + ", Возраст=" + age + " лет}";
    }
}
