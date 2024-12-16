package ru.mirea.practice.s0000001.task2;

public class MultiFuncChair implements Chair {
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public void sitinOn() {
        System.out.println("u siting on MultiFuncChair");
    }
}
