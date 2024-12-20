package ru.mirea.practice.s23k0087.task1;


public class Complex {
    private double real;
    private double imag;

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public Complex() {
        this.real = 0;
        this.imag = 0;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    @Override
    public String toString() {
        String complexString;
        if (imag >= 0) {
            complexString = String.format("%f + %fi", real, imag);
        } else {
            complexString = String.format("%f - %fi", real, Math.abs(imag));
        }
        return complexString;
    }
}
