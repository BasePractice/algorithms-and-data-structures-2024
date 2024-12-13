package ru.mirea.practice.s0000001.task2;

public class Victor implements Chair {
    private int age;

    @Override
    public void sit() {
        System.out.println("victor sit");
    }

    public int getAge() {
        return age;
    }

    public Victor(int age) {
        this.age = age;
    }
}
