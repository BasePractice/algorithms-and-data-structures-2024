package ru.mirea.practice.s29k0112.task2;

public class FunctionalChair implements Chair {
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public void sit() {
        System.out.println("Это функциональный стул");
    }

    @Override
    public void setChair(Chair chair) {
        System.out.println("Стул установлен");
    }
}
