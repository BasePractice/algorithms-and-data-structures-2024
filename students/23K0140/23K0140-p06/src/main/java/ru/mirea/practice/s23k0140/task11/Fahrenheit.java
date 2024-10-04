package ru.mirea.practice.s23k0140.task11;

class Fahrenheit implements Convertable {
    public double convert(double tmp) {
        return tmp * 9 / 5 + 32;
    }
}