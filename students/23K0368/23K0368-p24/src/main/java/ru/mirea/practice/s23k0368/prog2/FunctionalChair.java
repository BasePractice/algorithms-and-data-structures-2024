package ru.mirea.practice.s23k0368.prog2;

public class FunctionalChair implements Chair {
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public void sit() {
        System.out.println("Мы на него сели.");
    }
}
