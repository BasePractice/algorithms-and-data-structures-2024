package ru.mirea.practice.s0000001.task2;

public class VictorianChair implements Chair {
    private int age;

    public VictorianChair(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void sit() {
        System.out.println("Это викторианский стул");
    }

    @Override
    public void setChair(Chair chair) {
        System.out.println("Стул установлен");
    }
}
