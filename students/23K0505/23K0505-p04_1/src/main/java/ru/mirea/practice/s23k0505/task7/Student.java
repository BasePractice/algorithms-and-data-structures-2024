package ru.mirea.practice.s23k0505.task7;

public class Student extends Learner {
    public Student() {
        super();
    }

    public Student(String name, int age) {
        super(name, age);
    }

    public Student(String name, int age, float grade) {
        super(name, age, grade);
    }

    @Override
    public void study() {
        System.out.println(name + " сидит на парах");
    }

    @Override
    public String toString() {
        return "Студент{" + "ФИО= " + this.name + ", Возраст=" + this.age + " лет}";
    }
}
