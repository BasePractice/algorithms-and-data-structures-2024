package ru.mirea.practice.s23k0089.task1;


public class Complex {
    private double real;
    private double image;

    public Complex(double real, double image) {
        this.real = real;
        this.image = image;
    }

    public Complex() {
        this.real = 0;
        this.image = 0;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImage() {
        return image;
    }

    public void setImage(double image) {
        this.image = image;
    }

    @Override
    public String toString() {
        String complexString;
        if (image >= 0) {
            complexString = String.format("%f + %fi", real, image);
        } else {
            complexString = String.format("%f - %fi", real, Math.abs(image));
        }
        return complexString;
    }
}
