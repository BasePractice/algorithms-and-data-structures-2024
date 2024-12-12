package ru.mirea.practice.s0000001;

public class Complex {

    private int real;
    private int imaginary;

    public Complex() {
        this.real = 0;
        this.imaginary = 0;
    }

    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }
}
