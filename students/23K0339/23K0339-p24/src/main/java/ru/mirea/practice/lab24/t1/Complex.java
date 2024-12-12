package ru.mirea.practice.lab24.t1;

public class Complex {
    private final int real;
    private final int image;

    public Complex(int real, int image) {
        this.real = real;
        this.image = image;
    }

    public int getReal() {
        return real;
    }

    public int getImage() {
        return image;
    }

    @Override
    public String toString() {
        return real + " + " + image + "i";
    }
}

