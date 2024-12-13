package ru.mirea.practice.lab24.t2;

public class MultifunctionalChair implements Chair {

    @Override
    public void sit() {
        System.out.println("Вы сидите на многофункциональном стуле.");
    }

    public int sum(int a, int b) {
        return a + b;
    }
}

