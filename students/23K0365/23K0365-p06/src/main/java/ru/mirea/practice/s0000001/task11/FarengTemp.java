package ru.mirea.practice.s0000001.task11;

public class FarengTemp implements Convertable {
    private int temp;

    public FarengTemp(int temp) {
        this.temp = temp;
    }

    @Override
    public double convert() {
        return (temp - 32) * (5. / 9.);
    }

    @Override
    public String toString() {
        return temp + "*";
    }
}
