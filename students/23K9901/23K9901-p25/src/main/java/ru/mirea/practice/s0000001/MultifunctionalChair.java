package ru.mirea.practice.s0000001;

public class MultifunctionalChair implements Chair {
    @Override
    public void sit() {
        System.out.println("Вы сидите на многофункциональном стуле.");
    }

    public void transform() {
        System.out.println("Многофункциональный стул трансформируется в кровать.");
    }
}
