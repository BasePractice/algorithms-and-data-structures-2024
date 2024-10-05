package ru.mirea.practice.s23L0908;

class TmpFahrenheit implements Convertable {
    public double convert(double tmp) {
        return tmp * 9 / 5 + 32;
    }
}
