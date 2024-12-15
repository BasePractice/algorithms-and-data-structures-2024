package ru.mirea.practice.s00000024.task1;

class Complex {
    private int real;
    private int image;

    public Complex() {
        this.real = 0;
        this.image = 0;
    }

    public Complex(int real, int image) {
        this.real = real;
        this.image = image;
    }

    @Override
    public String toString() {
        if (image >= 0) {
            return real + " + " + image + "i";
        } else {
            return real + " - " + (-image) + "i";
        }
    }
}
