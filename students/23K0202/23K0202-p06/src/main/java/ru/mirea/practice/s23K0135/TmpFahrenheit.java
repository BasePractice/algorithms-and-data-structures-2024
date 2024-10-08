package ru.mirea.practice.s23K0135;

class TmpFahrenheit implements Convertable {
    public double convert(double tmp) {
        return tmp * 9 / 5 + 32;
    }
}
