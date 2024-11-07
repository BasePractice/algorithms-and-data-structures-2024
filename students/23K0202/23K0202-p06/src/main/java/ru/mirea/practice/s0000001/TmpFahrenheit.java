package ru.mirea.practice.s0000001;

class TmpFahrenheit implements Convertable {
    public double convert(double tmp) {
        return tmp * 9 / 5 + 32;
    }
}