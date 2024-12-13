package ru.mirea.practice.s23k0120.task1.utilclasses;

import ru.mirea.practice.s23k0120.task1.ComputingElement;

public class Number implements ComputingElement {
    private double value;

    public Number() {
        // Default constructor
    }

    public Number(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return Double.toString(value);
    }
}
