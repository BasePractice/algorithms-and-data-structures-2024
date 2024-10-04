package ru.mirea.practice.s23k0350.task2;

class Fahrenheit implements Convertable {
    double temp;

    public Fahrenheit(double temp) {
        this.temp = temp;
    }

    public double getTemp() {
        return temp;
    }

    public void convert() {
        temp = temp * 1.8 + 32;
    }

    @Override
    public String toString() {
        return "Fahrenheit: "
                +
                "Temperature = "
                + temp;
    }
}
