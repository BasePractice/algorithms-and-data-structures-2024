package ru.mirea.practice.s0000001.task1;

public class Complex {
    private int imaginary;
    private int real;

    public Complex(int imaginary, int real) {
        this.imaginary = imaginary;
        this.real = real;
    }

    public Complex() {
        //Default
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    @Override
    public String toString() {
        if (imaginary == 0 && real != 0) {
            return "Complex: " + real;
        } else if (imaginary == 0 && real == 0) {
            return "0";
        } else {
            return "Complex: " + real + " + i*(" + imaginary + ")";
        }
    }
}

