package ru.mirea.practice.s0000001.task1;

public class ConcreteFactory implements AbstractFactory {
    private int real;
    private int image;

    @Override
    public Complex createcomplex() {
        return new Complex(real,image);
    }

    public void setReal(int real) {
        this.real = real;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String toString() {
        return "complex: 1)real:" + real + ", 2)image:" + image;
    }
}
