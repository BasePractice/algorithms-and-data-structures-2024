package ru.mirea.practice.s23k0116.task1;

public class Complex {
    private int real; // Действительная часть
    private int image; // Мнимая часть


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


    public void setReal(int real) {
        this.real = real;
    }


    public void setImage(int image) {
        this.image = image;
    }


    @Override
    public String toString() {
        return real + " + " + image + "i";
    }
}
