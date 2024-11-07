package ru.mirea.practice.s23k0505.task7;

public class Pupil extends Learner {
    public Pupil() {
        super();
    }

    public Pupil(String name, int age) {
        super(name, age);
    }

    public Pupil(String name, int age, float grade) {
        super(name, age, grade);
    }

    @Override
    public void study() {
        System.out.println(name + " делает домашку");
    }

    @Override
    public String toString() {
        return "Школьник{" + "ФИО= " + name + ", Возраст=" + age + " лет}";
    }
}
