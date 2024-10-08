package ru.mirea.practice.s23K0135.n5;

public class Pupil {
    protected String name;

    public Pupil(String name) {
        this.name = name;
    }

    public String getType() {
        return "Учащийся";
    }

    @Override
    public String toString() {
        return name + " - " + getType();
    }
}
