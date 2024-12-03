package ru.mirea.practice.s0000001.task2;

public class Variable implements Expression {
    @Override
    public double evaluate(double x) {
        return x; // Возвращаем значение переменной x
    }
}