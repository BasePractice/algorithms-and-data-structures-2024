package ru.mirea.practice.s23k0135.task1;

public class Complex {
    private int real;
    private int img;

    public Complex(int real, int img) {
        this.real = real;
        this.img = img;
    }

    public int getReal() {
        return real;
    }

    public int getImaginary() {
        return img;
    }

    @Override
    public String toString() {
        return real + " + " + img + "i";
    }
}
