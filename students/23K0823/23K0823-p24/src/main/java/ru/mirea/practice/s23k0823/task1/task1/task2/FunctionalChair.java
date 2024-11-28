package ru.mirea.practice.s23k0823.task1.task1.task2;

public class FunctionalChair implements Chair {

    @Override
    public void sit() {
        System.out.println("Сижу на функциональном стуле.");
    }

    public int sum(int a, int b) {
        return a + b;
    }
}
