package ru.mirea.practice.s23k0350.task2;

class Calvin implements Convertable {
    double temp;

    public Calvin(double temp) {
        this.temp = temp;
    }

    public double getTemp() {
        return temp;
    }

    public void convert() {
        temp = temp + 273.15;
    }

    public String toString() {
        return "Calvin: "
                + "Temperature = "
                + temp;
    }
}