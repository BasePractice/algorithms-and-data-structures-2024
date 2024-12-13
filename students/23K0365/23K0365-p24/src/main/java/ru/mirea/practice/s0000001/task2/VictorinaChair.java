package ru.mirea.practice.s0000001.task2;

public class VictorinaChair implements Chair {
    private int age;

    public VictorinaChair(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void sitinOn() {
        System.out.println("u siting on VictorinaChair");
    }
}
